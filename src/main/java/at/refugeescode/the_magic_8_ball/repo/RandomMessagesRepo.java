package at.refugeescode.the_magic_8_ball.repo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class RandomMessagesRepo {

    private List<String> repository = new ArrayList<>();

    public void addMessages(String... messages) {
        repository.addAll(Arrays.asList(messages));
    }

    public String getRandomMessage() {
        Collections.shuffle(repository);
        return repository.get(0);
    }

}
