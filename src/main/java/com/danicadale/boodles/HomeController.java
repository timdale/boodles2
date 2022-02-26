package com.danicadale.boodles;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HomeController {


    private static int treatoCount = 0;



    @GetMapping(value = "/")
    public String root() {

        return "Hello, welcome to Boodle's REST microservice!";
    }



    @GetMapping(value = "/treato")
    public Treato getTreato() {

        String s = "Gib treato immediate, hooman!  Dispensing ";
        ++treatoCount;
        return switch (treatoCount % 3) {
            case 0 -> new com.danicadale.boodles.Treato(treatoCount, s + "Pig Ear!");
            case 1 -> new com.danicadale.boodles.Treato(treatoCount, s + "Scoobie Snac!");
            case 2 -> new com.danicadale.boodles.Treato(treatoCount, s + "Pizza!");
            default -> new com.danicadale.boodles.Treato(treatoCount, s + "Go lay down!");
        };
    }

}
