package site.shio3ch.panshopapp.domain.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "item_image")
public class ItemImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id", foreignKey = @ForeignKey(name = "fk_id"))
    private int id;

    @Column(name = "image")
    private byte[] image;
}
