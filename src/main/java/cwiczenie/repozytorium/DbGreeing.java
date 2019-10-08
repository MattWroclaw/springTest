package cwiczenie.repozytorium;

public class DbGreeing implements IGreetingRepo {

    String greet = "Baza danych";

    public DbGreeing(String adres){
        this.greet = adres;
    }

    public String getGreeting() {
        return greet;
    }
}
