package pl.mm.notesKeeper.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile("MySql")
@PropertySource("classpath:application-mysql.properties")
@Configuration
public class ConfigMySql {
}
