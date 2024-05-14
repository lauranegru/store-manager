package sportex.storemanager.configuration;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import sportex.storemanager.Application;

@CucumberContextConfiguration
@SpringBootTest(classes = Application.class)
public class Spring {
}
