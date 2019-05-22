package cputProject.controler.Exchange;
import cputProject.domain.Exchange.Transaction;
import cputProject.service.Exchange.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    @Qualifier("ServiceImplt")
    private TransactionService service;

    @PostMapping("/create")
    @ResponseBody
    public Transaction create(Transaction company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public Transaction update(Transaction company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Transaction read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Transaction> getAll() {
        return service.getAll();
    }

}
