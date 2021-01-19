package pl.bykowski.homeworkweek6.email;

public interface EmailService {
    void sendSimpleMessage(String to, String subject, String text);
}
