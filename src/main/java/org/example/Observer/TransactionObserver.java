package org.example.Observer;

public class TransactionObserver implements Observer {
    private final String observerName;

    public TransactionObserver(String name) {
        this.observerName = name;
    }

    @Override
    public void update(String state) {
        System.out.println(observerName + " notificado: Novo estado da transação -> " + state);
    }
}
