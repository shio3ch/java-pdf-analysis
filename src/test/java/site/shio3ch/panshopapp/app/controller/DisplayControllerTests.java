package site.shio3ch.panshopapp.app.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class DisplayControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void displayへリクエストを投げたら200OKが返却される() throws Exception {
        this.mockMvc.perform(get("/display")).andExpect(status().isOk());
    }

}
