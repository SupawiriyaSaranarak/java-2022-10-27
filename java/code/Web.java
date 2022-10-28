package code;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // return string name of html // use to make MVC web application //access html file in templates folder
class Web {
    
    @RequestMapping("/") 
    String showHome (Model model) {
        model.addAttribute("brand", "Star Coffee");
        String[] data = {"Latte", "Matcha", "Cappuccino"};
        model.addAttribute("products", data);
        model.addAttribute("telephone", "022222222");
        return "newhtml"; //report.html in templates folder
    }
    
    @RequestMapping("/icoffee") 
    String showICoffee (Model model) {
        model.addAttribute("brand", "Star Coffee");
        String[] data = {"Latte", "Matcha", "Cappuccino"};
        model.addAttribute("products", data);
        model.addAttribute("telephone", "022222222");
        return "report"; //report.html in templates folder
    }
    
    @RequestMapping("/sample")
    @ResponseBody // MVC web application that need to return JSON need to use this annotation
    Player showResult() {
        return new Player("David",7);
    }
    
}

record Player(String name, int number) {}

class Product {
    double price;
    double getSpecialPrice () {
        return price * 0.95;
    }
}

class Book extends Product {
    @Override // additional keyword for check the method in superclass // if not have this annotation it can override the same way // but it help programmer to ensure that it override correctly if not it will show error
    double getSpecialPrice () {
        return price * 0.9;
    }
}