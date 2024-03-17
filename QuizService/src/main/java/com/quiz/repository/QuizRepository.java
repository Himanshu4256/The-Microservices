package com.quiz.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.quiz.entities.Quiz;

public interface QuizRepository extends MongoRepository<Quiz, Long> {

}
