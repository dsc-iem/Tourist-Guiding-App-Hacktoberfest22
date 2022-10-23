package com.tourist.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tourist.app.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
