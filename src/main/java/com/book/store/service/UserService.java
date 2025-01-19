package com.book.store.service;

import com.book.store.requestDto.UserRequestDTO;
import com.book.store.responseDto.UserResponseDTO;

import java.util.List;

public interface UserService {
    UserResponseDTO register(UserRequestDTO userRequestDTO);

    List<UserResponseDTO> getAllUsers();

    UserResponseDTO getUserById(Long id);

    UserResponseDTO updateUser(Long id, UserRequestDTO userRequestDTO);

    UserResponseDTO deleteUser(Long id);
}
