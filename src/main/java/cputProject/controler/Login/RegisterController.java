package cputProject.controler.Login;
import cputProject.domain.Login.Register;
import cputProject.service.Login.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    @Qualifier("ServiceImplreg")
    private RegisterService service;

    @PostMapping("/create")
    @ResponseBody
    public Register create(Register company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public Register update(Register company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Register read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Register> getAll() {
        return service.getAll();
    }

}
