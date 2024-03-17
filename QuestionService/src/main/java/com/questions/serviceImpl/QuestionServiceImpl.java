package com.questions.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.questions.documents.Questions;
import com.questions.repository.QuestionRepository;
import com.questions.services.QuestionService;

@Service
public class QuestionServiceImpl  implements QuestionService{
	
	private QuestionRepository questionRepository;

	public QuestionServiceImpl(QuestionRepository questionRepository) {
		super();
		this.questionRepository = questionRepository;
	}

	@Override
	public Questions add(Questions question) {
		Questions save = questionRepository.save(question);
		return save;
	}

	@Override
	public List<Questions> findAll() {
		return questionRepository.findAll();
	}

	@Override
	public Questions findById(Integer id) {
		return questionRepository.findById(id).orElseThrow(()-> new RuntimeException("Error while fetching the data"));
	}

	@Override
	public List<Questions> findQuestionsOfQuiz(Integer id) {
		 List<Questions> findByQuizid = questionRepository.findByQuizid(id);
		 return findByQuizid;
	}

	
}