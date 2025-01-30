package org.example.ConcreteStates;

import org.example.Context.Transaction;
import org.example.State.State;

public class ApprovedState implements State {
    private Transaction transaction;

    public ApprovedState(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public String approve() {
        return "Transação já está aprovada.";
    }

    @Override
    public String decline() {
        return "Transação já aprovada, não pode ser recusada.";
    }

    @Override
    public String process() {
        transaction.setState(new ProcessedState(transaction));
        return "Transação processada com sucesso.";
    }

    @Override
    public String archive() {
        transaction.setState(new ArchivedState(transaction));
        return "Transação arquivada com sucesso.";
    }
}