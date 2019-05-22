package cputProject.controler.Login;
import cputProject.domain.Exchange.User;
import cputProject.domain.Login.UserValidation;
import cputProject.service.Login.UserValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/validation")
public class UserValidationController {

    @Autowired
    @Qualifier("ServiceImpluv")
    private UserValidationService service;

    @PostMapping("/create")
    @ResponseBody
    public UserValidation create(UserValidation company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public UserValidation update(UserValidation company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public UserValidation read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<UserValidation> getAll() {
        return service.getAll();
    }

}
