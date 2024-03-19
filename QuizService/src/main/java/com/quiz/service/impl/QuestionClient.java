package com.quiz.service.impl;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.documents.Questions;

@FeignClient(url = "http://localhost:8692", value = "Question-Client") // Base URL and QuestionService Micro port number, Value Just a Unique Name // @FeignClient -> Auto Start Sencond MicroServices
public interface QuestionClient {

	@GetMapping("/question/quiz/{quizId}") 
	List<Questions> findQuestionsOfQuiz(@PathVariable Long quizId);
}
