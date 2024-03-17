package com.questions.services;

import java.util.List;

import com.questions.documents.Questions;

public interface QuestionService {
	
	Questions add(Questions squestion);
	List<Questions> findAll();
	
	Questions findById(Integer id);
	
	List<Questions> findQuestionsOfQuiz(Integer id);

}
