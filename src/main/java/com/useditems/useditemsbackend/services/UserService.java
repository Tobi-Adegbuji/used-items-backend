package com.useditems.useditemsbackend.services;

import com.useditems.useditemsbackend.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    List<User> findAllUsers();

    User findById(Long id);

    void deleteById(Long id);

    User findByUsernameAndPassword(String username, String password);
}
