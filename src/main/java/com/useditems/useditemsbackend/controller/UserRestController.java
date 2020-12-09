package com.useditems.useditemsbackend.controller;
import com.useditems.useditemsbackend.model.User;
import com.useditems.useditemsbackend.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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


}
