package ch4.profiles.impl.dev;

import ch4.profiles.api.EnvPrinter;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class EnvPrinterImpl implements EnvPrinter {
    @Override
    public void print() {
        System.out.println("This is DEV-mode of bean");
    }
}
