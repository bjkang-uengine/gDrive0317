package gdrive.common;

import gdrive.DdBcApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DdBcApplication.class })
public class CucumberSpingConfiguration {}
