package com.dogu.quizapp.controller;

import com.dogu.quizapp.model.Question;
import com.dogu.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    // Get all questions
    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    // Get questions by category
    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionByCategory(category);
    }

    // Add a new question
    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        questionService.addQuestion(question);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    // Update an existing question
    @PutMapping("update")
    public ResponseEntity<String> updateQuestion(@RequestBody Question question){
        questionService.updateQuestion(question);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    // Delete a question by ID
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteByIdQuestion(@PathVariable Integer id){
        questionService.deleteQuestionById(id);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }
}
