package pl.mm.notesKeeper.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@EnableAutoConfiguration
@Profile("Unit-Test")
@PropertySource("classpath:application-unit-test.properties")
@Configuration
public class ConfigUnitTest {
}
