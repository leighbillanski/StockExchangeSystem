package cputProject.Repositories.Implementation.Exchange;

import cputProject.Repositories.Exchange.TransactionRepository;
import cputProject.domain.Exchange.Transaction;

import java.util.*;

public class TransactionRepositoryImp implements TransactionRepository {
    private static TransactionRepositoryImp repo = null;
    private Set<Transaction> comp;

    private TransactionRepositoryImp(){
        this.comp = new HashSet<>();
    }

    public static TransactionRepositoryImp getRepo(){
        if(repo == null){
            repo = new TransactionRepositoryImp();
        }
        return repo;
    }

    @Override
    public Set<Transaction> getAll() {
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
        for(Iterator<Transaction> it = comp.iterator(); it.hasNext(); ){
            Transaction c = it.next();
            if (c.equals(new Transaction.Builder().desc(s))){
                this.comp.remove(c);
            }
        }


    }

    @Override
    public Transaction read(Transaction company) {
        return company;
    }
}
