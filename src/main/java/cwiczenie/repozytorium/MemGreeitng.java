package cwiczenie.repozytorium;

import org.springframework.stereotype.Component;

@Component
public class MemGreeitng implements IGreetingRepo {
   String greet = "Pozdro z Memory";

    public String getGreeting() {
        return greet;
    }
}
