package site.shio3ch.panshopapp.app.controller.display;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import site.shio3ch.panshopapp.domain.service.ItemService;

@Controller
public class DisplayController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/display")
    public String display(Model model) {
        model.addAttribute("itemList", itemService.getAllItems());
        return "display";
    }

}
