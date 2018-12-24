package com.bizz.userservice.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bizz.userservice.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByMobile(String mobile);
   // List<User> findByUserName(String name);
}
