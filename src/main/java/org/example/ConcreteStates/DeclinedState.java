package org.example.ConcreteStates;

import org.example.Context.Transaction;
import org.example.State.State;

public class DeclinedState implements State {
    private Transaction transaction;

    public DeclinedState(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public String approve() {
        return "Transação está recusada, não pode ser aprovada.";
    }

    @Override
    public String decline() {
        return "Transação já foi recusada.";
    }

    @Override
    public String process() {
        return "Transação está recusada, não pode ser processada.";
    }

    @Override
    public String archive() {
        transaction.setState(new ArchivedState(transaction));
        return "Transação arquivada com sucesso.";
    }
}
