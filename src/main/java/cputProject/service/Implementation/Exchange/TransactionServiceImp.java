package cputProject.service.Implementation.Exchange;

import cputProject.Repositories.Exchange.TransactionRepository;
import cputProject.domain.Exchange.Transaction;
import cputProject.service.Exchange.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ServiceImplt")
public class TransactionServiceImp implements TransactionService {
    @Autowired
    @Qualifier("InMemoryt")
    private TransactionRepository repository;
    @Override
    public Set<Transaction> getAll() {
        return repository.getAll();
    }

    @Override
    public Transaction create(Transaction transaction) {
        return repository.create(transaction);
    }

    @Override
    public Transaction read(String transaction) {
        return repository.read(transaction);
    }

    @Override
    public Transaction update(Transaction transaction) {
        return repository.update(transaction);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);

    }
}
