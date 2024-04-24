package by.damirbek.test.models.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String username;
    private String password;
    private String fullName;
    private String avatarUrl;
}
