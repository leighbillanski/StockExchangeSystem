package cputProject.service.Exchange;

import cputProject.domain.Exchange.Transaction;
import cputProject.service.Service;

import java.util.Set;

public interface TransactionService extends Service<Transaction,String> {
    Set<Transaction> getAll();
}
