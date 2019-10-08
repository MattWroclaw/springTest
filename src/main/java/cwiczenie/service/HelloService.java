package cwiczenie.service;

import cwiczenie.repozytorium.DbGreeing;
import cwiczenie.repozytorium.MemGreeitng;
import org.springframework.stereotype.Component;

@Component
public class HelloService {
    DbGreeing dbGreeing;
    MemGreeitng memGreeitng;

    public HelloService(DbGreeing baza, MemGreeitng memory){
        this.dbGreeing = baza;
        this.memGreeitng = memory;
    }

    public void npiszHello(String odKogo){
        String greeting;
        switch (odKogo){
            case "baza":
                 greeting = dbGreeing.getGreeting();
                 break;
            case "memo":
                greeting = memGreeitng.getGreeting();
                break;
                default:
                    greeting = "Nie ma czegoś takiego";
        }
        System.out.println(greeting);
    }

}
