package cputProject.controler.Exchange;
import cputProject.domain.Exchange.Security;
import cputProject.service.Exchange.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/security")
public class SecurityController {

    @Autowired
    @Qualifier("ServiceImplsec")
    private SecurityService service;

    @PostMapping("/create")
    @ResponseBody
    public Security create(Security company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public Security update(Security company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Security read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Security> getAll() {
        return service.getAll();
    }

}
