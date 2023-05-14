package org.semicolon.africa.jmailApp.Services;

import org.semicolon.africa.jmailApp.data.Models.Mail;
import org.semicolon.africa.jmailApp.data.Models.MailBox;
import org.semicolon.africa.jmailApp.dtos.RegisterRequest.CreateMailRequest;

public interface mailBox {
    Mail send(CreateMailRequest createMailRequest);
}

