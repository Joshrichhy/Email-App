package org.semicolon.africa.jmailApp.dtos.Response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FindUserResponse {
    private String fullName;
    private String emailAddress;
    private String dateCreated;

}
