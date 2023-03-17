package gdrive.common;

import gdrive.BbBcApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BbBcApplication.class })
public class CucumberSpingConfiguration {}
