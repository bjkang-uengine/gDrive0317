package gdrive.common;

import gdrive.AaBcApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { AaBcApplication.class })
public class CucumberSpingConfiguration {}
