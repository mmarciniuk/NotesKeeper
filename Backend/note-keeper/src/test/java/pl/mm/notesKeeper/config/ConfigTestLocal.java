package pl.mm.notesKeeper.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile("TestLocal")
@PropertySource("classpath:application-test-local.properties")
@Configuration
public class ConfigTestLocal {
}
