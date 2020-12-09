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
    public void createUser(@RequestBody User user){
        userService.saveUser(user);
    }

    @GetMapping("/user")
    public List<User> retrieveAllUsers(){
        return userService.findAllUsers();
    }

    @DeleteMapping("/user/{name}")
    public void deleteUserByName(@PathVariable String name){
        System.out.println(name);
        userService.deleteByFirstName(name);
    }


}
