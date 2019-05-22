package cputProject.service.Implementation.Exchange;

import cputProject.Repositories.Exchange.SellerRepository;
import cputProject.domain.Exchange.Seller;
import cputProject.service.Exchange.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImplsel")
public class SellerServiceImp implements SellerService {
    @Autowired
    @Qualifier("InMemorysel")
    private SellerRepository repository;
    @Override
    public Set<Seller> getAll() {
        return repository.getAll();
    }

    @Override
    public Seller create(Seller seller) {
        return repository.create(seller);
    }

    @Override
    public Seller read(String seller) {
        return repository.read(seller);
    }

    @Override
    public Seller update(Seller seller) {
        return repository.update(seller);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);

    }
}
