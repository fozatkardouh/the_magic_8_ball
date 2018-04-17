package at.refugeescode.the_magic_8_ball.endpoint;

import at.refugeescode.the_magic_8_ball.repo.RandomMessagesRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class BallEndpoint {

    private final RandomMessagesRepo randomMessagesRepo;

    @GetMapping
    public String home(Model model) {
        model.addAttribute("message", randomMessagesRepo.getRandomMessage());
        return "home";
    }

}
