package com.useditems.useditemsbackend.dao;

import com.useditems.useditemsbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User,Long> {

    List<User> findAll();

    User findByUserNameAndPassword(String username, String password);

}
