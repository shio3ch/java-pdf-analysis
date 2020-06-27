package site.shio3ch.panshopapp.app.controller.display;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import site.shio3ch.panshopapp.domain.model.ItemImage;
import site.shio3ch.panshopapp.domain.service.ItemImageService;

@Controller
public class DisplayImageController {

    @Autowired
    private ItemImageService itemImageService;

    @RequestMapping(value = "/display-image", method = RequestMethod.GET)
    @ResponseBody
    public byte[] displayImage(@RequestParam("id") String id) throws Exception {
        int iId = Integer.parseInt(id);
        ItemImage itemImage = itemImageService.getItemImage(iId);
        return itemImage.getImage();
    }
}
