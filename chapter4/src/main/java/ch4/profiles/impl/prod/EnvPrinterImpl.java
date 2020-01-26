package ch4.profiles.impl.prod;

import ch4.profiles.api.EnvPrinter;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class EnvPrinterImpl implements EnvPrinter {
    @Override
    public void print() {
        System.out.println("This is PROD-mode of bean");
    }
}
