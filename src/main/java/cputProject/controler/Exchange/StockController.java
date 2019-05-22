package cputProject.controler.Exchange;
import cputProject.domain.Exchange.Stock;
import cputProject.service.Exchange.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    @Qualifier("ServiceImplst")
    private StockService service;

    @PostMapping("/create")
    @ResponseBody
    public Stock create(Stock company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public Stock update(Stock company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Stock read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Stock> getAll() {
        return service.getAll();
    }

}
