package cwiczenie.prywatne;

import cwiczenie.repozytorium.DbGreeing;
import cwiczenie.repozytorium.MemGreeitng;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import cwiczenie.service.GreetingService;

@Configuration
public class BeanConfig {

    @Bean
    public DbGreeing getDbGreeting(){
        String greet = "Baza danych";
        DbGreeing dbGreeing = new DbGreeing(greet);
        return dbGreeing;
    }

    @Bean
    public GreetingService greetingServiceDb(@Qualifier("getDbGreeting") DbGreeing bazaDanych ){
        return new GreetingService(bazaDanych);
    }

//    @Bean
//    public MemGreeitng getMemoGreetingFunkcja(){
//        return new MemGreeitng();
//    }

    @Bean
    public GreetingService greetingServiceMemo(@Qualifier("memGreeitng") MemGreeitng memory){
    return new GreetingService(memory);
    }
}
