package pl.mm.notesKeeper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles(profiles = {"TestLocal"})
@SpringBootTest
public class BaseApplicationTest {
}
