package com.useditems.useditemsbackend.services;

import com.useditems.useditemsbackend.dao.UserRepo;
import com.useditems.useditemsbackend.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service("userServiceImpl")
public class UserServiceImpl implements UserService{

    private final UserRepo userRepo;


    //Constructor Injection
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void saveUser(User user) {
        if(user != null)
            userRepo.save(user);
        log.info(user.getFirstName() + " was created.");
    }

    @Override
    public List<User> findAllUsers() {
        log.info("List was retrieved.");
        return userRepo.findAll();
    }

    @Transactional
    @Override
    public void deleteByFirstName(String name) {
        userRepo.deleteByFirstName(name);
    }
}
