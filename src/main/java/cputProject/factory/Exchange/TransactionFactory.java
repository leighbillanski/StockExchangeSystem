package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Transaction;
import cputProject.util.Misc;

public class TransactionFactory {
    public static Transaction getTransavtion(String transaction){
        return  new Transaction.Builder().desc(transaction).id(Misc.generateId())
                .build();
    }
}
