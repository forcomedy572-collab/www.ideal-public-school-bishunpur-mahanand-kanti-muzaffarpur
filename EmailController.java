import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/send-admission-email")
    public void sendAdmissionEmail(@RequestBody Map<String, String> payload) {
        String name = payload.getOrDefault("name", "");
        String email = payload.getOrDefault("email", "");
        String phone = payload.getOrDefault("phone", "");
        emailService.sendAdmissionEmail(name, email, phone);
    }
}
