package net.engineeringdigest.journalApp;

import net.engineeringdigest.journalApp.Entity.User;
import net.engineeringdigest.journalApp.Repository.UserRepository;
import net.engineeringdigest.journalApp.Service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public class UserRepositoryImp  {

//private MongoTemplate mongoTemplate;
//public UserRepositoryImp(MongoTemplate mongoTemplate){
//    this.mongoTemplate=mongoTemplate;
//}
//
//public List<User>getUserForSA(){
//    Query query= new Query();
//
//   query.addCriteria(Criteria.where("email").exists(true));
//    query.addCriteria(Criteria.where("email").ne(null).ne(""));
//    query.addCriteria(Criteria.where("sentimentAnalysis").is(true));
//    List<User> users = mongoTemplate.find(query, User.class);
//    return users;
//}


}
