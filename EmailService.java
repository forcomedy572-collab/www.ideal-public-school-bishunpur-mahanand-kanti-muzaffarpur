import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendAdmissionEmail(String name, String email, String phone) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("mdtausif53256@gmail.com");
        message.setSubject("New Admission Application");
        message.setText("Name: " + name + "\nEmail: " + email + "\nPhone: " + phone);
        mailSender.send(message);
    }
}
