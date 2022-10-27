package code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Start {
    public static void main (String[] data){
        System.out.println("Welcome to java-27");
        ApplicationContext context;
        context = SpringApplication.run(Setup.class);
    }
}
@SpringBootApplication
class Setup {
    
}
@RestController
class Sample {
    @RequestMapping("/check")
    int check() {
        return 321;
    }
}