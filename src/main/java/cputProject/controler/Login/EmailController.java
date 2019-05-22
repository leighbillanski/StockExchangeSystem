package cputProject.controler.Login;
import cputProject.domain.Login.Email;
import cputProject.service.Login.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    @Qualifier("ServiceImple")
    private EmailService service;

    @PostMapping("/create")
    @ResponseBody
    public Email create(Email company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public Email update(Email company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Email read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Email> getAll() {
        return service.getAll();
    }

}
