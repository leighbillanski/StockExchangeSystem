package cputProject.controler.Exchange;
import cputProject.domain.Exchange.StockSold;
import cputProject.service.Exchange.StockSoldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/sold")
public class StockSoldController {

    @Autowired
    @Qualifier("ServiceImplsts")
    private StockSoldService service;

    @PostMapping("/create")
    @ResponseBody
    public StockSold create(StockSold company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public StockSold update(StockSold company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public StockSold read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<StockSold> getAll() {
        return service.getAll();
    }

}
