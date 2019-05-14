package codegym.danang.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController {

	@Value("${spring.application.name}")
    String appName = "Welcome ";
 
	@RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "/fragments/p2";
    }

    @GetMapping("/page1")
    public String page2() {
        return "/fragments/p1";
    }
}
