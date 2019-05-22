package cputProject.controler.Exchange;
import cputProject.domain.Exchange.Buyer;
import cputProject.service.Exchange.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/buyer")

public class BuyerController {

    @Autowired
    @Qualifier("ServiceImplbu")
    private BuyerService service;

    @PostMapping("/create")
    @ResponseBody
    public Buyer create(Buyer company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public Buyer update(Buyer company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Buyer read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Buyer> getAll() {
        return service.getAll();
    }

}
