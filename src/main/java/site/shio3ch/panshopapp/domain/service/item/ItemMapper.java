package site.shio3ch.panshopapp.domain.service.item;

import org.mapstruct.Mapper;
import site.shio3ch.panshopapp.domain.model.item.Item;
import site.shio3ch.panshopapp.domain.repository.item.ItemEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    Item itemEntityToItem(ItemEntity entity);

    List<Item> itemEntitiesToItems(List<ItemEntity> entities);

}
