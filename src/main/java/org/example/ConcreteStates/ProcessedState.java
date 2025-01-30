package org.example.ConcreteStates;

import org.example.Context.Transaction;
import org.example.State.State;

public class ProcessedState implements State {
    private Transaction transaction;

    public ProcessedState(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public String approve() {
        return "Transação já foi processada.";
    }

    @Override
    public String decline() {
        return "Transação já foi processada.";
    }

    @Override
    public String process() {
        return "Transação já foi processada.";
    }

    @Override
    public String archive() {
        transaction.setState(new ArchivedState(transaction));
        return "Transação arquivada com sucesso.";
    }
}

