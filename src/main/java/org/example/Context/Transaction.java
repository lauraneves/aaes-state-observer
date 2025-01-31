package org.example.Context;

import org.example.ConcreteStates.PendingState;
import org.example.Observer.Observer;
import org.example.State.State;
import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private State currentState;
    private final List<Observer> observers = new ArrayList<>();

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
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(currentState.getClass().getSimpleName());
        }
    }
}
