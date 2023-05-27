package com.example.demomongodbconnection.controller;


import com.example.demomongodbconnection.model.Authentication;
import com.example.demomongodbconnection.repositary.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    Repository repository;
    @RequestMapping(value = "signup", method = RequestMethod.GET)
    public String signup() {
        return "signup";
    }

    @RequestMapping(value = "signup", method = RequestMethod.POST)
    public void signupPost(@RequestParam String FirstName, @RequestParam String LastName, @RequestParam String email, @RequestParam  String password) {
      repository.save(new Authentication(1,FirstName, LastName, email,password));

    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String loginPost(@RequestParam String email, @RequestParam  String password) {
        List<Authentication> list = repository.findAll();
        for(int i = 0; i < list.size(); i++) {
            if(email.equals(list.get(i).getEmail()) && password.equals(list.get(i).getPassword())) {
                 return "signup";
            }
        }
        return "login";
    }
}