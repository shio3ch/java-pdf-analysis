package site.shio3ch.panshopapp.app.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import site.shio3ch.panshopapp.domain.model.ItemImage;
import site.shio3ch.panshopapp.domain.service.ItemImageServiceImpl;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class DisplayImageControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ItemImageServiceImpl mockService;

    private final static String REQUEST_URL = "/display-image";

    private final static String PARAM_OF_ID = "id";

    @Test
    void displayImageへリクエストを投げたら200OKが返却される() throws Exception {
        // モックServiceが返すテストデータを準備
        ItemImage itemImage = new ItemImage();
        itemImage.setId(1);
        itemImage.setImage(new byte[]{0, 1, 2, 3});
        when(mockService.getItemImage(1)).thenReturn(itemImage);

        // リクエストの発行
        this.mockMvc.perform(get(REQUEST_URL).param(PARAM_OF_ID, "1")).andExpect(status().isOk());
    }
}
