package com.autostock.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autostock.api.model.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
    User findByLogin(String login);
}
