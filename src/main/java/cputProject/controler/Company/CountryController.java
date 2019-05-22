package cputProject.controler.Company;
import cputProject.domain.Company.Country;
import cputProject.service.Company.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/country")

public class CountryController {

    @Autowired
    @Qualifier("ServiceImplc")
    private CountryService service;

    @PostMapping("/create")
    @ResponseBody
    public Country create(Country company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public Country update(Country company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Country read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Country> getAll() {
        return service.getAll();
    }

}
