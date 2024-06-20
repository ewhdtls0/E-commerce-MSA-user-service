package my.ecommerce.userservice.service;

import my.ecommerce.userservice.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
}
