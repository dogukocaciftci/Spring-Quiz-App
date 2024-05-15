package com.dogu.quizapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter // Lombok Getter annotation
@Setter // Lombok Setter annotation
@ToString // Lombok ToString annotation
@RequiredArgsConstructor // Lombok RequiredArgsConstructor annotation
@Entity // JPA Entity annotation
public class Question {

    @Id // JPA Id annotation
    @GeneratedValue(strategy = GenerationType.IDENTITY) // JPA GeneratedValue annotation with strategy
    private Integer id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightAnswer;
    private String difficultyLevel;
    private String category;

}
