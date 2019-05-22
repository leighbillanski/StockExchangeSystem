package cputProject.controler.Exchange;
import cputProject.domain.Exchange.User;
import cputProject.service.Exchange.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("ServiceImplu")
    private UserService service;

    @PostMapping("/create")
    @ResponseBody
    public User create(User company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public User update(User company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public User read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<User> getAll() {
        return service.getAll();
    }

}
