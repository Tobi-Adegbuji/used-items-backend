package com.useditems.useditemsbackend.services;

import com.useditems.useditemsbackend.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    List<User> findAllUsers();

    void deleteByFirstName(String name);

}
