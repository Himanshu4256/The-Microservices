package com.quiz.service;

import java.util.List;

import com.quiz.documents.Quiz;

public interface QuizService {
		Quiz add(Quiz quiz);
		List<Quiz> get();
		Quiz getOne(Long id);	
}
