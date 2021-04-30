package site.shio3ch.panshopapp.domain.repository.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ItemRepositoryTest {

    @Autowired
    private ItemRepository repository;

    @Test
    public void getAllItems_DBの全ての値が取得できること() {
        // 自動生成されるメソッドの検証は正直、意味は無いが、しばらくはサンプル的に残しておく。
        // モックが返却するテストデータの準備
        ItemEntity item1 = new ItemEntity();
        item1.setId(1);
        item1.setName("アンパン");
        item1.setInTaxPrice(120);
        item1.setIntroduction("あんがたっぷり詰まったパンだパン。");
        item1.setContent("# content");
        ItemEntity item2 = new ItemEntity();
        item2.setId(2);
        item2.setName("食パン");
        item2.setInTaxPrice(600);
        item2.setIntroduction("味はしません。");
        item2.setContent("# content");
        ItemEntity item3 = new ItemEntity();
        item3.setId(3);
        item3.setName("カレーパン");
        item3.setInTaxPrice(240);
        item3.setIntroduction("10辛よりも辛いです。");
        item3.setContent("# content");
        List<ItemEntity> list = new ArrayList<ItemEntity>();
        list.add(item1);
        list.add(item2);
        list.add(item3);

        // テスト対象メソッドの実行
        List<ItemEntity> actualList = repository.findAll();

        assertThat(actualList.size()).isEqualTo(list.size());
        assertEquals(actualList, list);
    }

}
