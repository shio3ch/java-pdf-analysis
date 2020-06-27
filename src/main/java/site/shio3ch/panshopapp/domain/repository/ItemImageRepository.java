package site.shio3ch.panshopapp.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import site.shio3ch.panshopapp.domain.model.ItemImage;

@Repository
public interface ItemImageRepository extends JpaRepository<ItemImage, Long> {

    public ItemImage findById(int id);
}
