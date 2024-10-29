package net.engineeringdigest.journalApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import static org.mockito.Mockito.verify;

public class EmailServiceTest {

//    @Mock
//    private JavaMailSender javaMailSender;
//
//    @InjectMocks
//    private EmailService emailService;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    void testSendMail() {
//        String to = "Strikerwastken@gmail.com";
//        String subject = "testing the java mail sender";
//        String body = "hello";
//
//        emailService.sendEmail(to, subject, body);
//
//        // Verify that the email was sent with the correct parameters
//        verify(javaMailSender).send(Mockito.any(SimpleMailMessage.class));
//    }
}
