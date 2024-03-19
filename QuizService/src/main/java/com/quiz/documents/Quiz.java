package com.quiz.documents;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "QuizData")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Quiz {
	
	@Id
	private Long id;
	private String title;
	private Long quizId;
	
	transient private List<Questions> questions;  
}
