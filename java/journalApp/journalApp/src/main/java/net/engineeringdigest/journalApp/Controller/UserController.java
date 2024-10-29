package net.engineeringdigest.journalApp.Controller;

import net.engineeringdigest.journalApp.Entity.User;
import net.engineeringdigest.journalApp.Repository.UserRepository;
import net.engineeringdigest.journalApp.Service.UserService;
import net.engineeringdigest.journalApp.Service.WeatherService;
import net.engineeringdigest.journalApp.apiiResponse.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final UserRepository userRepository;
    private  final WeatherService weatherService;
//    private final RestTemplate restTemplate;


@Autowired
    public UserController(UserService userService, UserRepository userRepository, WeatherService weatherService, RestTemplate restTemplate) {
        this.userService = userService;
        this.userRepository = userRepository;
        this.weatherService = weatherService;
//    this.restTemplate = restTemplate;
    }

@GetMapping("/abc")
    public List<User> getAllUsers(){
        return userService.getAll();

    }

    @PostMapping
    public void createEntry(@RequestBody User user){
    userService.saveUser(user);
    }

    @PutMapping
    public ResponseEntity<?> updateUser(@RequestBody User user){
       Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
       String userName = authentication.getName();
       User UserInDB = userService.findByUserName(userName);
       UserInDB.setUserName(user.getUserName());
       UserInDB.setPassword((user.getPassword()));
       userService.saveUser(UserInDB);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteUserById(@RequestBody User user){
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        userRepository.deleteByUserName(authentication.getName());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("weather/{city}")
    public ResponseEntity<?> greeting(@PathVariable String city){
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        WeatherResponse weatherResponse = weatherService.getWeather(city);
        String greeting = "";
        if(weatherResponse!=null){
            greeting =" the temperature in " +city+" is " + weatherResponse.getCurrent().getTemperature() +
                    " and it  feels like "+weatherResponse.getCurrent().getFeelslike() ;
        }
        return new ResponseEntity<>("Hi "+ authentication.getName()+ greeting ,HttpStatus.OK);
    }

}
