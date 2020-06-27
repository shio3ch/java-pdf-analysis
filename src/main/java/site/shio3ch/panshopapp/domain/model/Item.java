package site.shio3ch.panshopapp.domain.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "introduction")
    private String introduction;

    @Column(name = "in_tax_price")
    private int inTaxPrice;

    @Column(name = "content")
    private String content;

}
