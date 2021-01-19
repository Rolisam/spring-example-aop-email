package pl.bykowski.homeworkweek6.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.bykowski.homeworkweek6.email.EmailService;
import pl.bykowski.homeworkweek6.email.EmailServiceImpl;

import javax.mail.MessagingException;
import java.util.Arrays;

@Aspect
@Component
public class MovieAspect {


    private EmailService emailSender;

    @Autowired
    public MovieAspect(EmailServiceImpl emailSender) {
        this.emailSender = emailSender;
    }

    @After("@annotation(SendEmail)")
    private void mailSender(JoinPoint joinPoint) {
        emailSender.sendSimpleMessage("assassin91@op.pl", "Movies", "The video has been added to the list \n" + Arrays.stream(joinPoint.getArgs()).findFirst().get().toString());
    }

}
