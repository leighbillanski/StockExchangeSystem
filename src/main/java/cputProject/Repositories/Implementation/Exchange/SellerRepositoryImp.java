package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.SellerRepository;
import cputProject.domain.Exchange.Seller;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemorysel")
public class SellerRepositoryImp implements SellerRepository {
    private static SellerRepositoryImp repo = null;
    private Map<String,Seller> comp;

    private SellerRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static SellerRepositoryImp getRepo(){
        if(repo == null){
            repo = new SellerRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Seller> getAll() {
        Collection<Seller> students = this.comp.values();
        Set<Seller> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public Seller create(Seller company) {
        this.comp.put(company.getId(),company);
        return company;
    }

    @Override
    public Seller update(Seller company) {
        this.comp.replace(company.getId(),company);
        return this.comp.get(company.getId());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);

    }

    @Override
    public Seller read(String company) {
        return this.comp.get(company);
    }
}
