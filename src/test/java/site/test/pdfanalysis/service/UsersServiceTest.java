package site.test.pdfanalysis.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import site.test.pdfanalysis.db.service.UsersService;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
public class UsersServiceTest {

    @Autowired
    private UsersService service;

    @Test
    public void testGetAllUsers() {
        try {
            assertNotNull(service.getAllUsers());
        } catch (Exception e) {
            fail();
        }
    }

}
