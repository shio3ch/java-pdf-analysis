package site.shio3ch.panshopapp.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import site.shio3ch.panshopapp.domain.model.ItemImage;
import site.shio3ch.panshopapp.domain.repository.ItemImageRepository;

@Service
@Transactional
public class ItemImageServiceImpl implements ItemImageService {

    @Autowired
    private ItemImageRepository itemImageRepository;

    @Override
    public ItemImage getItemImage(int id) {
        return itemImageRepository.findById(id);
    }

}
