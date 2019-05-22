package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.TransactionRepository;
import cputProject.domain.Exchange.Transaction;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository("InMemoryt")
public class TransactionRepositoryImp implements TransactionRepository {
    private static TransactionRepositoryImp repo = null;
    private Map<String,Transaction> comp;

    private TransactionRepositoryImp(){
        this.comp = new HashMap<>();
    }

    public static TransactionRepositoryImp getRepo(){
        if(repo == null){
            repo = new TransactionRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Transaction> getAll() {
        Collection<Transaction> students = this.comp.values();
        Set<Transaction> set = new HashSet<>();
        set.addAll(students);
        return set;
    }

    @Override
    public Transaction create(Transaction company) {
        this.comp.put(company.getId(),company);
        return company;
    }

    @Override
    public Transaction update(Transaction company) {
        this.comp.replace(company.getId(),company);
        return this.comp.get(company.getId());
    }

    @Override
    public void delete(String s) {
        this.comp.remove(s);


    }

    @Override
    public Transaction read(String company) {
        return this.comp.get(company);
    }
}
