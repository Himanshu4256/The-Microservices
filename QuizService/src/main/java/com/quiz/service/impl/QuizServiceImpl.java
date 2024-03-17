package com.quiz.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.quiz.entities.Quiz;
import com.quiz.repository.QuizRepository;
import com.quiz.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService{

	  
	private QuizRepository quizRepository;
	
	public QuizServiceImpl(QuizRepository quizRepository) {
		super();
		this.quizRepository = quizRepository;
	}

	@Override
	public Quiz add(Quiz quiz) {
		 Quiz save = quizRepository.save(quiz);
		 return save;
	}

	@Override
	public List<Quiz> get() {
		return quizRepository.findAll();
	}

	@Override
	public Quiz getOne(Long id) {
 		return quizRepository.findById(id).orElseThrow(()-> new RuntimeException("Question not fund") );
	}

}
