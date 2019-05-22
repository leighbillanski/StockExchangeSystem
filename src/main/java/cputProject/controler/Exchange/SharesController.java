package cputProject.controler.Exchange;
import cputProject.domain.Company.Company;
import cputProject.domain.Exchange.Shares;
import cputProject.service.Company.CompanyService;
import cputProject.service.Exchange.SharesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/shares")
public class SharesController {

    @Autowired
    @Qualifier("ServiceImplsh")
    private SharesService service;

    @PostMapping("/create")
    @ResponseBody
    public Shares create(Shares company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public Shares update(Shares company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Shares read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Shares> getAll() {
        return service.getAll();
    }

}
