package at.refugeescode.the_magic_8_ball.initializer;

import at.refugeescode.the_magic_8_ball.repo.RandomMessagesRepo;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Starter {

    @Bean
    public ApplicationRunner applicationRunner(RandomMessagesRepo randomMessagesRepo) {
        return args -> randomMessagesRepo.addMessages("Make your everyday decisions easier!", "Don't count on it"
                , "Most likely", "My reply is no", "It is decidedly so");
    }

}
