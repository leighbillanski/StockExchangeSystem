package cputProject.controler.Login;
import cputProject.domain.Login.RetreivePassword;
import cputProject.service.Login.RetrievePasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/retrieve")
public class RetrievePasswordController {

    @Autowired
    @Qualifier("ServiceImplrp")
    private RetrievePasswordService service;

    @PostMapping("/create")
    @ResponseBody
    public RetreivePassword create(RetreivePassword company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public RetreivePassword update(RetreivePassword company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public RetreivePassword read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<RetreivePassword> getAll() {
        return service.getAll();
    }

}
