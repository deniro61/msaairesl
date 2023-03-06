package msaairesl.common;


import msaairesl.ReservationhistApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ReservationhistApplication.class })
public class CucumberSpingConfiguration {
    
}
