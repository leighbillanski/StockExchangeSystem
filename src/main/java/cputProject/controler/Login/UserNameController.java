package cputProject.controler.Login;
import cputProject.domain.Login.UserName;
import cputProject.service.Login.UserNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/username")
public class UserNameController {

    @Autowired
    @Qualifier("ServiceImplun")
    private UserNameService service;

    @PostMapping("/create")
    @ResponseBody
    public UserName create(UserName company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public UserName update(UserName company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public UserName read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<UserName> getAll() {
        return service.getAll();
    }

}
