package msaairesl.common;


import msaairesl.NotimgmtApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { NotimgmtApplication.class })
public class CucumberSpingConfiguration {
    
}
