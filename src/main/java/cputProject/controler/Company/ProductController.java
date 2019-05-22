package cputProject.controler.Company;
import cputProject.domain.Company.Product;
import cputProject.service.Company.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/product")

public class ProductController {

    @Autowired
    @Qualifier("ServiceImplp")
    private ProductService service;

    @PostMapping("/create")
    @ResponseBody
    public Product create(Product company) {
        return service.create(company);
    }

    @PostMapping("/update")
    @ResponseBody
    public Product update(Product company) {
        return service.update(company);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Product read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Product> getAll() {
        return service.getAll();
    }

}
