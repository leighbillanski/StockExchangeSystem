package cputProject.controler.Exchange;
import cputProject.domain.Exchange.Order;
import cputProject.service.Exchange.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    @Qualifier("ServiceImplo")
    private OrderService service;

    @PostMapping("/create")
    @ResponseBody
    public Order create(Order company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public Order update(Order company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Order read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Order> getAll() {
        return service.getAll();
    }

}
