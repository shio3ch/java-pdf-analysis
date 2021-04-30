package site.shio3ch.panshopapp.application.controller.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import site.shio3ch.panshopapp.application.controller.home.view.ItemView;
import site.shio3ch.panshopapp.domain.model.item.Item;

import java.util.List;

@Component
public class HomeControllerHelper {

    @Autowired
    private HomeMapper mapper;

    List<ItemView> convertItemViewModel(List<Item> dtos) {
        return mapper.itemsToItemViews(dtos);
    }

}
