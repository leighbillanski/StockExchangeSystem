package cputProject.controler.Company;
import cputProject.domain.Company.Industry;
import cputProject.service.Company.IndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/industry")

public class IndustryController {

    @Autowired
    @Qualifier("ServiceImpli")
    private IndustryService service;

    @PostMapping("/create")
    @ResponseBody
    public Industry create(Industry company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public Industry update(Industry company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Industry read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Industry> getAll() {
        return service.getAll();
    }

}
