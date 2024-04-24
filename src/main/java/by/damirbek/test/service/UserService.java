package by.damirbek.test.service;

import by.damirbek.test.models.dto.UserDTO;
import by.damirbek.test.models.entity.User;

public interface UserService {
    User registerUser(UserDTO userDTO);
    User authUser(UserDTO userDTO);
}
