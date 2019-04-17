package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Transaction;

public class TransactionFactory {
    public static Transaction getTransavtion(String transaction){
        return  new Transaction.Builder().desc(transaction)
                .build();
    }
}
