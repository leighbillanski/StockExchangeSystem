package cputProject.controler.Company;

import cputProject.domain.Company.Company;
import cputProject.service.Company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    @Qualifier("ServiceImpl")
    private CompanyService service;

    @PostMapping("/create")
    @ResponseBody
    public Company create(Company company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public Company update(Company company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Company read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Company> getAll() {
        return service.getAll();
    }
}
