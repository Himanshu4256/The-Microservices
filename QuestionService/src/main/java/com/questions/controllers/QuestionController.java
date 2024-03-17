package com.questions.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.questions.documents.Questions;
import com.questions.services.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	
	private QuestionService questionService;

	public QuestionController(QuestionService questionService) {
		super();
		this.questionService = questionService;
	}
	
	@PostMapping
	public Questions create(@RequestBody Questions questions) {
		return questionService.add(questions);
	}
	
	@GetMapping("/all")
	public List<Questions> getAll(){
		return questionService.findAll();
	}
	
	@GetMapping("/{id}")
	public Questions getOne(@PathVariable Integer id){
		return questionService.findById(id);	
	}
	@GetMapping("quiz/{quizId}")
	public List<Questions> findByQuizId(@PathVariable("quizId") Integer Id) {
		return questionService.findQuestionsOfQuiz(Id);
	}
}
