package com.useditems.useditemsbackend.controller;
import com.useditems.useditemsbackend.model.User;
import com.useditems.useditemsbackend.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRestController {

    private final UserService userService;

    public UserRestController(@Qualifier("userServiceImpl") UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        user.setId(0L);
        userService.saveUser(user);
        return user;
    }

    @GetMapping("/user")
    public List<User> retrieveAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable  Long id){
        if(userService.findById(id).getId()==0){
            return null;
        }else{
            return userService.findById(id);
        }
    }

    @PutMapping("/updateUser")
    public User update(@RequestBody User user){
        userService.saveUser(user);
        return user;
    }

    @DeleteMapping("/user/{id}")
    public void deleteUserByName(@PathVariable Long id){
        userService.deleteById(id);
    }


}
