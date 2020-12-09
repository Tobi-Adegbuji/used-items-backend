package com.useditems.useditemsbackend.dao;

import com.useditems.useditemsbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
