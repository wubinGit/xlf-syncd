package syncd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class syncd {

    @GetMapping("/")
    public String getSyncd(){
        return "hello syncd";
    }

}
