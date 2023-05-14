package org.semicolon.africa.jmailApp.dtos;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
@Data
public class RegisterUserRequest {
    private String firstName;
    private String lastName;
    private String password;
    private String emailAddress;
    private LocalDateTime dateCreated = LocalDateTime.now();
}
