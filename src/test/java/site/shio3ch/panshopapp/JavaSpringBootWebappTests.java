package site.shio3ch.panshopapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@ContextConfiguration
@TestPropertySource("/applicationTest.properties")
public class JavaSpringBootWebappTests {

    @Test
    void contextLoads() {

    }

}
