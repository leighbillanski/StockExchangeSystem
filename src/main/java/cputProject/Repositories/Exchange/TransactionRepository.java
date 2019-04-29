package cputProject.Repositories.Exchange;

import cputProject.Repositories.Repository;
import cputProject.domain.Exchange.Transaction;

import java.util.List;
import java.util.Set;

public interface TransactionRepository extends Repository<Transaction, String> {
    List<Transaction> getAll();
}
