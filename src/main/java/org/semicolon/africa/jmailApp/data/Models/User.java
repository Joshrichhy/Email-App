package org.semicolon.africa.jmailApp.data.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class User {
    private String firstName;
    private String lastName;
    private String password;
    private String emailAddress;
    private LocalDateTime dateCreated = LocalDateTime.now();
   @Id
    private String userId;
}
