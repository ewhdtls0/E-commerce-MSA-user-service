package my.ecommerce.userservice.service;

import my.ecommerce.userservice.dto.UserDto;
import my.ecommerce.userservice.jpa.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();
}
