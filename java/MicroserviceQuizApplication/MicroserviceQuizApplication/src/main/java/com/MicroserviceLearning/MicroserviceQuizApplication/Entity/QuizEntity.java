package com.MicroserviceLearning.MicroserviceQuizApplication.Entity;

import lombok.Data;
import org.bson.types.ObjectId;


@Data
public class QuizEntity {
private ObjectId id;
private String Question;
private String Option1;
private String Option2;
private String Option3;
private String Option4;
private String rightanswer;

}
