package org.example.ConcreteStates;

import org.example.Context.Transaction;
import org.example.State.State;

public class PendingState implements State {
    private Transaction transaction;

    public PendingState(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public String approve() {
        transaction.setState(new ApprovedState(transaction));
        return "Transação aprovada com sucesso.";
    }

    @Override
    public String decline() {
        transaction.setState(new DeclinedState(transaction));
        return "Transação recusada com sucesso.";
    }

    @Override
    public String process() {
        return "Transação pendente. Aprove ou recuse antes de processar.";
    }

    @Override
    public String archive() {
        transaction.setState(new ArchivedState(transaction));
        return "Transação arquivada com sucesso.";
    }
}

