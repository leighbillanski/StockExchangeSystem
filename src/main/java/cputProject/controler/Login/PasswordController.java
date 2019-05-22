package cputProject.controler.Login;
import cputProject.domain.Login.Password;
import cputProject.service.Login.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/password")
public class PasswordController {

    @Autowired
    @Qualifier("ServiceImplpa")
    private PasswordService service;

    @PostMapping("/create")
    @ResponseBody
    public Password create(Password company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public Password update(Password company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Password read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Password> getAll() {
        return service.getAll();
    }

}
