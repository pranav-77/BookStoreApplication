package com.book.store.mapper;

import com.book.store.model.User;
import com.book.store.requestDto.UserRequestDTO;
import com.book.store.responseDto.UserResponseDTO;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User mapToEntity(UserRequestDTO userRequestDTO) {
        User user = new User();
        user.setFirstName(userRequestDTO.getFirstName());
        user.setLastName(userRequestDTO.getLastName());
        user.setEmail(userRequestDTO.getEmail());
        user.setPassword(userRequestDTO.getPassword());
        user.setPhoneNumber(userRequestDTO.getPhoneNumber());
        user.setIsActive(userRequestDTO.getIsActive());
        user.setRegistrationDate(userRequestDTO.getRegistrationDate());
        user.setRole(userRequestDTO.getRole());
        return user;
    }

    public UserResponseDTO mapToResponse(User user) {
        UserResponseDTO userResponseDTO = new UserResponseDTO();
        userResponseDTO.setId(user.getId());
        userResponseDTO.setFirstName(user.getFirstName());
        userResponseDTO.setLastName(user.getLastName());
        userResponseDTO.setEmail(user.getEmail());
        userResponseDTO.setPhoneNumber(user.getPhoneNumber());
        userResponseDTO.setIsActive(user.getIsActive());
        userResponseDTO.setRegistrationDate(user.getRegistrationDate());
        userResponseDTO.setRole(user.getRole());
        return userResponseDTO;
    }
}
