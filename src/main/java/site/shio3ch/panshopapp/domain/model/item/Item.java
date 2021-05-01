package site.shio3ch.panshopapp.domain.model.item;

import lombok.Data;

@Data
public class Item {

    private int id;

    private String name;

    private String introduction;

    private int inTaxPrice;

    private String content;

}
