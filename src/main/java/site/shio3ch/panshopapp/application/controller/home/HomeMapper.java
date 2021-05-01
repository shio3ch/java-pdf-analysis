package site.shio3ch.panshopapp.application.controller.home;

import org.mapstruct.Mapper;
import site.shio3ch.panshopapp.application.controller.home.view.ItemView;
import site.shio3ch.panshopapp.domain.model.item.Item;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HomeMapper {

    ItemView itemToItemView(Item dto);

    List<ItemView> itemsToItemViews(List<Item> dtos);

}
