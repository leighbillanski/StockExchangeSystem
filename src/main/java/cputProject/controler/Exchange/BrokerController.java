package cputProject.controler.Exchange;
import cputProject.domain.Exchange.Broker;
import cputProject.service.Exchange.BrokerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/broker")

public class BrokerController {

    @Autowired
    @Qualifier("ServiceImplbr")
    private BrokerService service;

    @PostMapping("/create")
    @ResponseBody
    public Broker create(Broker company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public Broker update(Broker company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Broker read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Broker> getAll() {
        return service.getAll();
    }

}
