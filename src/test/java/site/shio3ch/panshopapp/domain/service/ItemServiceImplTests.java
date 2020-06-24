package site.shio3ch.panshopapp.domain.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import site.shio3ch.panshopapp.domain.model.Item;
import site.shio3ch.panshopapp.domain.repository.ItemRepository;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;

public class ItemServiceImplTests {

    @Mock
    private ItemRepository repository;

    @InjectMocks
    private ItemServiceImpl target;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getAllItems_DBの全ての値が取得できること() {
        // モックが返却するテストデータの準備
        Item firstItem = new Item();
        firstItem.setId(1);
        firstItem.setName("test1");
        firstItem.setInTaxPrice(101);
        firstItem.setIntroduction("introduction1");
        firstItem.setContent("content1");

        Item secondItem = new Item();
        secondItem.setId(2);
        secondItem.setName("test2");
        secondItem.setInTaxPrice(102);
        secondItem.setIntroduction("introduction2");
        secondItem.setContent("content2");

        List<Item> list = new ArrayList<Item>();
        list.add(firstItem);
        list.add(secondItem);

        when(repository.findAll()).thenReturn(list);

        // テスト対象メソッドの実行
        List<Item> actualList = repository.findAll();

        // 返却値の検証
        assertThat(actualList.size()).isEqualTo(2);
        actualList.forEach(item -> {
            switch (item.getId()) {
                case 1:
                    assertThat(item.getId()).isEqualTo(1);
                    assertThat(item.getName()).isEqualTo("test1");
                    assertThat(item.getInTaxPrice()).isEqualTo(101);
                    assertThat(item.getIntroduction()).isEqualTo("introduction1");
                    assertThat(item.getContent()).isEqualTo("content1");
                    break;
                case 2:
                    assertThat(item.getId()).isEqualTo(2);
                    assertThat(item.getName()).isEqualTo("test2");
                    assertThat(item.getInTaxPrice()).isEqualTo(102);
                    assertThat(item.getIntroduction()).isEqualTo("introduction2");
                    assertThat(item.getContent()).isEqualTo("content2");
                    break;
                default:
                    fail();
            }
        });
    }

}
