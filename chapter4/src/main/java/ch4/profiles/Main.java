package ch4.profiles;

import ch4.profiles.api.EnvPrinter;
import ch4.profiles.conf.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        EnvPrinter printer = context.getBean(EnvPrinter.class);
        printer.print();
    }
}
