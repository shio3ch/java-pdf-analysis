package site.shio3ch.panshopapp.application.controller.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import site.shio3ch.panshopapp.domain.service.item.ItemService;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private HomeControllerHelper helper;

    @Autowired
    private ItemService itemService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("itemList", helper.convertItemViewModel(itemService.getAllItems()));
        return "application/home/index";
    }

}
