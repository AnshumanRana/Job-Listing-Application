package com.MicroserviceLearning.MicroserviceQuizApplication.Repository;

import com.MicroserviceLearning.MicroserviceQuizApplication.Entity.QuizEntity;
import org.bson.types.ObjectId;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends MongoRepository<QuizEntity, ObjectId> {


}
