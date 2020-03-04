package pl.mm.notesKeeper;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;

@SqlGroup({
        @Sql("classpath:02-db-schema.sql"),
        @Sql("classpath:03-db-init-data.sql")
})
@ActiveProfiles("Unit-Test")
@SpringBootTest
public class BaseApplicationTest {
}
