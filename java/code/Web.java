package code;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // return string name of html // use to make MVC web application
class Web {
    @RequestMapping("/") 
    String showHome (Model model) {
        model.addAttribute("brand", "Star Coffee");
        String[] data = {"Latte", "Matcha", "Cappuccino"};
        model.addAttribute("products", data);
        model.addAttribute("telephone", "022222222");
        return "report"; //report.html
    }
    
    @RequestMapping("/sample")
    @ResponseBody // MVC web application that need to return JSON need to use this annotation
    Player showResult() {
        return new Player("David",7);
    }
    
}

record Player(String name, int number) {}