package com.tourist.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tourist.app.entity.User;

@Service
public interface UserInterface {

	public List<User> getAllUsers();

	public User getUserbyId(String id);

	public List<User> getUserbyFirstName(String firstName);

	public List<User> getUserbyLastName(String lastName);

	public List<User> getUserbyCity(String city);

	public List<User> getUserbyCountry(String country);

	public List<User> getUserbyState(String state);

	public User getUserbypreferredLanguage(String prefLanguage);

}
