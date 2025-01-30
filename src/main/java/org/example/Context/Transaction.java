package org.example.Context;

import org.example.ConcreteStates.PendingState;
import org.example.State.State;

public class Transaction {
    private State currentState;

    public Transaction() {
        this.currentState = new PendingState(this); // initial state
    }

    public String approve() {
        return currentState.approve();
    }

    public String decline() {
        return currentState.decline();
    }

    public String process() {
        return currentState.process();
    }

    public String archive() {
        return currentState.archive();
    }

    public void setState(State state) {
        this.currentState = state;
    }
}
