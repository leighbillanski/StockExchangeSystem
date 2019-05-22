package cputProject.controler.Exchange;
import cputProject.domain.Exchange.StockAvailable;
import cputProject.service.Exchange.StockAvailableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/available")
public class StockAvailableController {

    @Autowired
    @Qualifier("ServiceImplsta")
    private StockAvailableService service;

    @PostMapping("/create")
    @ResponseBody
    public StockAvailable create(StockAvailable company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public StockAvailable update(StockAvailable company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public StockAvailable read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<StockAvailable> getAll() {
        return service.getAll();
    }

}
