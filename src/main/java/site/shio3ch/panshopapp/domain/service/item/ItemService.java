package site.shio3ch.panshopapp.domain.service.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.shio3ch.panshopapp.domain.model.item.Item;
import site.shio3ch.panshopapp.domain.repository.item.ItemRepository;

import java.util.List;

@Service
public class ItemService {
    
    @Autowired
    ItemRepository repository;

    @Autowired
    ItemMapper mapper;

    public List<Item> getAllItems() {
        return mapper.itemEntitiesToItems(repository.findAll());
    }

}
