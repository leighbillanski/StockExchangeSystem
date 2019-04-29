package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.TransactionRepository;
import cputProject.domain.Exchange.Transaction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TransactionRepositoryImp implements TransactionRepository {
    private static TransactionRepositoryImp repo = null;
    private List<Transaction> comp;

    private TransactionRepositoryImp(){
        this.comp = new ArrayList<>();
    }

    public static TransactionRepositoryImp getRepo(){
        if(repo == null){
            repo = new TransactionRepositoryImp();
        }
        return repo;
    }

    @Override
    public List<Transaction> getAll() {
        return this.comp;
    }

    @Override
    public Transaction create(Transaction company) {
        this.comp.add(company);
        return company;
    }

    @Override
    public Transaction update(Transaction company) {
        if(!company.equals(null)) {
            return company;
        }
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Transaction read(Transaction company) {
        return company;
    }
}
