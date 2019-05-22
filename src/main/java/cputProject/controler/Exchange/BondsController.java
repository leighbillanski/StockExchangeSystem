package cputProject.controler.Exchange;
import cputProject.domain.Exchange.Bonds;
import cputProject.service.Exchange.BondsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/bonds")

public class BondsController {

    @Autowired
    @Qualifier("ServiceImplbo")
    private BondsService service;

    @PostMapping("/create")
    @ResponseBody
    public Bonds create(Bonds company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public Bonds update(Bonds company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Bonds read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Bonds> getAll() {
        return service.getAll();
    }

}
