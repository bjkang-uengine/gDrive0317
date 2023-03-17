package gdrive.common;

import gdrive.EeBcApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { EeBcApplication.class })
public class CucumberSpingConfiguration {}
