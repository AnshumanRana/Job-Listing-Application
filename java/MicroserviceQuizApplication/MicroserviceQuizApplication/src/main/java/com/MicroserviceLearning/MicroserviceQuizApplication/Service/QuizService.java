package com.MicroserviceLearning.MicroserviceQuizApplication.Service;

import com.MicroserviceLearning.MicroserviceQuizApplication.Entity.QuizEntity;
import com.MicroserviceLearning.MicroserviceQuizApplication.Repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


public class QuizService {

@Autowired
   private QuizRepository quizRepository;

public List<QuizEntity> getAllQuestions(){
    return quizRepository.findAll();

}
}
