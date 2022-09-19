package com.edu.ulab.app.service;

import com.edu.ulab.app.dto.UserDto;

import java.util.Optional;

public interface UserService {
    UserDto createUser(UserDto userDto);

    Optional<UserDto> updateUser(UserDto userDto);

    Optional<UserDto> getUserById(Long id);

    void deleteUserById(Long id);

}
