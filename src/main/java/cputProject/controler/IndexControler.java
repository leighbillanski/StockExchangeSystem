package cputProject.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexControler {
    @GetMapping("/")
    @ResponseBody
    public String getHome(){
        return "Hello World";
    }
}
