package com.book.store.controller;

import com.book.store.requestDto.UserRequestDTO;
import com.book.store.responseDto.UserResponseDTO;
import com.book.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("message")
    public String message() {
        return "Welcome To BookStore";
    }

    @PostMapping("register")
    public UserResponseDTO register(@RequestBody UserRequestDTO userRequestDTO) {
        return userService.register(userRequestDTO);
    }

    @GetMapping("users")
    public List<UserResponseDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("user/{id}")
    public UserResponseDTO getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PutMapping("update/{id}")
    public UserResponseDTO updateUser(@PathVariable Long id, @RequestBody UserRequestDTO userRequestDTO) {
        return userService.updateUser(id, userRequestDTO);
    }

    @DeleteMapping("delete/{id}")
    public UserResponseDTO deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }
}
