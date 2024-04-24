package by.damirbek.test.service.impl;

import by.damirbek.test.exception.IncorrectPasswordException;
import by.damirbek.test.exception.UsernameAlreadyExistsException;
import by.damirbek.test.exception.UsernameNotFoundException;
import by.damirbek.test.models.dto.UserDTO;
import by.damirbek.test.models.entity.User;
import by.damirbek.test.repository.UserRepository;
import by.damirbek.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    @Autowired
    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    @Override
    public User registerUser(UserDTO userDTO) {
        if(userRepository.existsByUsername(userDTO.getUsername())){
            throw new UsernameAlreadyExistsException("User with username " + userDTO.getUsername() + " already exist" );
        }

        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        user.setFullName(userDTO.getFullName());
        user.setAvatarUrl(userDTO.getAvatarUrl());

        return userRepository.save(user);
    }

    @Override
    public User authUser(UserDTO userDTO) {

        User user = userRepository.findUserByUsername(userDTO.getUsername());
        if (user != null) {
            if (passwordEncoder.matches(userDTO.getPassword(), user.getPassword())) {
                return user;
            } else {
                throw new IncorrectPasswordException("Incorrect password for user with username " + userDTO.getUsername());
            }
        } else {
            throw new UsernameNotFoundException("User with username " + userDTO.getUsername() + " not found");
        }
    }


}
