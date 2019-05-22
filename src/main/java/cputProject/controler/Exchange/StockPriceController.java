package cputProject.controler.Exchange;
import cputProject.domain.Exchange.StockPrice;
import cputProject.service.Exchange.StockPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/price")
public class StockPriceController {

    @Autowired
    @Qualifier("ServiceImplstp")
    private StockPriceService service;

    @PostMapping("/create")
    @ResponseBody
    public StockPrice create(StockPrice company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public StockPrice update(StockPrice company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public StockPrice read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<StockPrice> getAll() {
        return service.getAll();
    }

}
