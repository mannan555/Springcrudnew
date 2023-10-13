package com.reactbackend.springcrudcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reactbackend.springcrudmodel.User;
import com.reactbackend.springcrudrepository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("users")
    public List < User > getUsers() {
        return this.userRepository.findAll();
    }
    // create user rest api
    @PostMapping("/employees")
    public User createUser(@RequestBody User employee) {
        return userRepository.save(employee);
    }
    
    // get user by id rest api
 //   @GetMapping("/employees/{id}")
 //   public ResponseEntity <User> getEmployeeId(@PathVariable Long id){
  //  	User employee = userRepository.findById(id).orElseThrow(null);
 //   }
    
}