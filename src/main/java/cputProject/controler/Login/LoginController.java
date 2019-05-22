package cputProject.controler.Login;
import cputProject.domain.Login.Login;
import cputProject.service.Login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    @Qualifier("ServiceImpll")
    private LoginService service;

    @PostMapping("/create")
    @ResponseBody
    public Login create(Login company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public Login update(Login company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Login read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Login> getAll() {
        return service.getAll();
    }

}
