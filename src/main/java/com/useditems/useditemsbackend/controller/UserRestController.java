package com.useditems.useditemsbackend.controller;
import com.useditems.useditemsbackend.model.User;
import com.useditems.useditemsbackend.model.UserCredentials;
import com.useditems.useditemsbackend.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class UserRestController {

    private final UserService userService;

    public UserRestController(@Qualifier("userServiceImpl") UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        user.setId(0L);
        userService.saveUser(user);
        return user;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return userService.findAllUsers();
    }

    @PostMapping("/authUsers")
    public User authenticate(@RequestBody UserCredentials userCredentials){
       return userService.findByUsernameAndPassword(userCredentials.getUserName(), userCredentials.getPassword());
    }

    @GetMapping("/users/{id}")
    public User findById(@PathVariable  Long id){
        if(userService.findById(id).getId()==0){
            return null;
        }else{
            return userService.findById(id);
        }
    }

    @PutMapping("/users")
    public User update(@RequestBody User user){
        userService.saveUser(user);
        return user;
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable Long id){
        userService.deleteById(id);
    }




}
