package com.MicroserviceLearning.MicroserviceQuizApplication.Controller;

import com.MicroserviceLearning.MicroserviceQuizApplication.Entity.QuizEntity;
import com.MicroserviceLearning.MicroserviceQuizApplication.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class  QuizController {
    @Autowired
    private QuizService quizService;


    @GetMapping("allQuestions")
    public List<QuizEntity> allQuestions(){
        System.out.println("these are the questions");
        return  quizService.getAllQuestions();
    }
}
