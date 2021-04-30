package site.shio3ch.panshopapp.application.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import site.shio3ch.panshopapp.domain.model.item.Item;
import site.shio3ch.panshopapp.domain.service.item.ItemService;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class DisplayControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ItemService mockService;

    private final static String REQUEST_URL = "/home";

    @BeforeEach
    void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void homeへリクエストを投げたら200OKが返却される() throws Exception {
        // モックServiceが返すテストデータを準備
        List<Item> itemList = new ArrayList<>();
        Item item = new Item();
        item.setName("testData");
        item.setIntroduction("testIntroduction");
        item.setContent("testContext");
        item.setInTaxPrice(1);
        itemList.add(item);
        when(mockService.getAllItems()).thenReturn(itemList);

        // リクエストの発行
        this.mockMvc.perform(get(REQUEST_URL)).andExpect(status().isOk());
    }

}
