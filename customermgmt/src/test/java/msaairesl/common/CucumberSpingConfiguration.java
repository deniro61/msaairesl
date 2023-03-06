package msaairesl.common;


import msaairesl.CustomermgmtApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomermgmtApplication.class })
public class CucumberSpingConfiguration {
    
}
