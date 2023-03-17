package gdrive.common;

import gdrive.CcBcApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CcBcApplication.class })
public class CucumberSpingConfiguration {}
