package com.example.UserManagementSystem.controller;

import com.example.UserManagementSystem.model.UserModel;
import com.example.UserManagementSystem.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/User-Management-app")

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/add-User")
    public void addUser(@RequestBody UserModel userModel){
        userService.addUser(userModel);
    }
    @GetMapping("find-all")
    public List<UserModel> findAllRestaurants() {
        return userService.findAll();
    }
    @GetMapping("/find-user/id/{id}")
    public UserModel findRestaurantById(@PathVariable int id) {
        return userService.findById(id);
    }
    @PutMapping("/update-user/id/{id}")
    public void updateUser(@PathVariable int id, @RequestBody UserModel userModel) {
        userService.updateUser(id, userModel);
    }
    @DeleteMapping("/delete-user/id/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }
}
