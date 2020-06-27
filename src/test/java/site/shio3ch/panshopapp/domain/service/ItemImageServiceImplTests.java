package site.shio3ch.panshopapp.domain.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import site.shio3ch.panshopapp.domain.model.ItemImage;
import site.shio3ch.panshopapp.domain.repository.ItemImageRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ItemImageServiceImplTests {

    @Mock
    ItemImageRepository repository;

    @InjectMocks
    ItemImageServiceImpl target;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getItemImage_データ取得が行えること() {
        // モックが返却するテストデータの準備
        ItemImage itemImage = new ItemImage();
        itemImage.setId(1);
        itemImage.setImage(new byte[]{0, 1, 2, 3});
        when(repository.findById(1)).thenReturn(itemImage);

        // テスト対象メソッドの実行
        ItemImage actual = target.getItemImage(1);

        // 返却値の検証
        assertThat(actual.getId()).isEqualTo(1);
        assertThat(actual.getImage()).isEqualTo(new byte[]{0, 1, 2, 3});
    }
}
