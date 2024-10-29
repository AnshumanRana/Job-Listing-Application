package net.engineeringdigest.journalApp.Controller;

import net.engineeringdigest.journalApp.Entity.User;
import net.engineeringdigest.journalApp.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private UserService userService;
    public AdminController(UserService userService){
        this.userService=userService;
    }
@GetMapping("/all-users")
    public ResponseEntity<?> getAllUsers(){
        List<User> all=userService.getAll();
        if(all!=null && !all.isEmpty()){
            return new ResponseEntity<>(all, HttpStatus.OK);
        }
        return new ResponseEntity<>( HttpStatus.NOT_FOUND);
    }
    @PostMapping("/create-admin-user")
    public void userAdmin(@RequestBody User user){
         userService.saveAdmin(user);
    }
}
