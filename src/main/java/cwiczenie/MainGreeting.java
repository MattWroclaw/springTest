package cwiczenie;

import cwiczenie.prywatne.ApplicationConfig;
import cwiczenie.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;


public class MainGreeting {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        HelloService bean = context.getBean(HelloService.class);
        bean.npiszHello("memo");
        bean.npiszHello("baza");
    }
}
