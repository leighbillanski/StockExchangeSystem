package cputProject.controler.Exchange;
import cputProject.domain.Exchange.Seller;
import cputProject.service.Exchange.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    @Qualifier("ServiceImplsel")
    private SellerService service;

    @PostMapping("/create")
    @ResponseBody
    public Seller create(Seller company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public Seller update(Seller company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Seller read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Seller> getAll() {
        return service.getAll();
    }

}
