package com.questions.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.questions.documents.Questions;

public interface QuestionRepository extends MongoRepository<Questions, Integer>{
		List<Questions> findByQuizid(Integer quizId);
}
