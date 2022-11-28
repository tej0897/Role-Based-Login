package com.dataloaderportal.DataLoaderPortal.controller;

import com.dataloaderportal.DataLoaderPortal.entity.User;
import com.dataloaderportal.DataLoaderPortal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostConstruct
    public void initRolesAndUsers(){
        userService.initRoleAndUser();
    }

    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody User user){
        return userService.registerNewUser(user);
    }

    // to perform only admin roles
    @GetMapping({"/forAdmin"})
    @PreAuthorize("hasRole('Admin')")
    public String forAdmin(){
        return "This URL is only accessible to the admin";
    }

    // to perform common operation, i.e. uploading Excel sheet
    @GetMapping({"/forUser"})
    @PreAuthorize("hasAnyRole('User','Admin')")
    public String forUser(){
        return "This URL is only accessible to the user";
    }
}
