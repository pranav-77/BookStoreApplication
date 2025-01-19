package com.book.store.serviceImpl;

import com.book.store.mapper.UserMapper;
import com.book.store.model.User;
import com.book.store.repository.UserRepository;
import com.book.store.requestDto.UserRequestDTO;
import com.book.store.responseDto.UserResponseDTO;
import com.book.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserResponseDTO register(UserRequestDTO userRequestDTO) {
        User user = userMapper.mapToEntity(userRequestDTO);
        return userMapper.mapToResponse(userRepository.save(user));
    }

    @Override
    public List<UserResponseDTO> getAllUsers() {
        return userRepository
                .findAll()
                .stream()
                .map(userMapper::mapToResponse)
                .toList();
    }

    @Override
    public UserResponseDTO getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not Found"));
        return userMapper.mapToResponse(user);
    }

    @Override
    public UserResponseDTO updateUser(Long id, UserRequestDTO userRequestDTO) {
        getUserById(id);
        User user = userMapper.mapToEntity(userRequestDTO);
        user.setId(id);
        userRepository.save(user);
        return userMapper.mapToResponse(user);
    }

    @Override
    public UserResponseDTO deleteUser(Long id) {
        getUserById(id);
        userRepository.deleteById(id);
        return null;
    }
}
