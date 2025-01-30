package org.example.ConcreteStates;

import org.example.Context.Transaction;
import org.example.State.State;

public class ArchivedState implements State {
    public ArchivedState(Transaction transaction) {
    }

    @Override
    public String approve() {
        return "Não é possível alterar estado de uma transação arquivada.";
    }

    @Override
    public String decline() {
        return "Não é possível alterar estado de uma transação arquivada.";
    }

    @Override
    public String process() {
        return "Não é possível alterar estado de uma transação arquivada.";
    }

    @Override
    public String archive() {
        return "Transação já foi arquivada.";
    }
}
