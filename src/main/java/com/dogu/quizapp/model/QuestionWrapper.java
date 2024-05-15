package com.dogu.quizapp.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter // Lombok Getter annotation
@Setter // Lombok Setter annotation
@ToString // Lombok ToString annotation
@RequiredArgsConstructor // Lombok RequiredArgsConstructor annotation
public class QuestionWrapper {

    private Integer id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    public QuestionWrapper(Integer id, String option4, String option3, String option2, String option1, String questionTitle) {
        this.id = id;
        this.option4 = option4;
        this.option3 = option3;
        this.option2 = option2;
        this.option1 = option1;
        this.questionTitle = questionTitle;
    }
}
