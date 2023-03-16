package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.demo.model.User;
@RestController
public class UserController {
@GetMapping("/users")
// sous l'url localhost:8080/users => exécute la méthode au dessous
public String getUser()
{
User user=new User("Ahmed", "Ali");
return user.toString();
}
@PostMapping("/users")
public String CreateUser(@RequestBody User user)
{
return "User created successfully "+user.toString();	
}
}
