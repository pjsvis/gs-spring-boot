package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot! Let\'s see if we can get Swagger 2 working. Then we can look at generating typescript interfaces";
    }

}
