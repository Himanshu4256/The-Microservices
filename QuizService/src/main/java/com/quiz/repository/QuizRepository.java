package com.quiz.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.quiz.documents.Quiz;

public interface QuizRepository extends MongoRepository<Quiz, Long> {

}
