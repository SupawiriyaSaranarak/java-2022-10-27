package code;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//class Start {
//    public static void main (String[] data){
//        System.out.println("Welcome to java-27");
//        ApplicationContext context;
//        context = SpringApplication.run(Setup.class);
//    }
//}
//@SpringBootApplication
//class Setup {
//    
//}
//@RestController //RestController -> JSON
//class Sample {
//    @Value("${company.brand}")
//    String brand;
//    @RequestMapping("/check")
//    String check() {
//        return brand;
//    }
//}

@SpringBootApplication 
@RestController
class Start {
    public static void main (String[] data){
        System.out.println("Welcome to java-27");
        SpringApplication.run(Start.class);
    }
    
    @RequestMapping("/check")
    String check() {
        return "I love you";
    }
}