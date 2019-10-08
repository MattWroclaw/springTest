package cwiczenie.service;

import cwiczenie.repozytorium.IGreetingRepo;

public class GreetingService {
    IGreetingRepo greetingRepo;

    public  GreetingService(IGreetingRepo greetingRepo){
        this.greetingRepo = greetingRepo;
    }


}
