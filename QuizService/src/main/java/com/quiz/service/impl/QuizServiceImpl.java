package com.quiz.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.quiz.documents.Quiz;
import com.quiz.repository.QuizRepository;
import com.quiz.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService{

	  
	private QuizRepository quizRepository;
	private QuestionClient questionClient;

	public QuizServiceImpl(QuizRepository quizRepository, QuestionClient questionClient) {
		super();
		this.quizRepository = quizRepository;
		this.questionClient = questionClient;
	}

	@Override
	public Quiz add(Quiz quiz) {
		 Quiz save = quizRepository.save(quiz);
		 return save;
	}

	@Override
	public List<Quiz> get() {
		 List<Quiz> quizzes = quizRepository.findAll();
		 
		 List<Quiz> newQuizList = quizzes.stream().map(quiz -> {
			 quiz.setQuestions(questionClient.findQuestionsOfQuiz(quiz.getId()));
			 return quiz;
		 }).collect(Collectors.toList());
		 return newQuizList;
	}

	@Override
	public Quiz getOne(Long id) {
 		 Quiz quiz = quizRepository.findById(id).orElseThrow(()-> new RuntimeException("Question not fund") );
 		 quiz.setQuestions(questionClient.findQuestionsOfQuiz(quiz.getId()));
 		 return quiz;
	}

}
