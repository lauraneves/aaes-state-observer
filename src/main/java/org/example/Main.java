package org.example;

import org.example.Context.Transaction;
import org.example.Observer.TransactionObserver;

public class Main {
    public static void main(String[] args) {
        Transaction transaction = new Transaction();

        TransactionObserver observer1 = new TransactionObserver("Observador 1");
        TransactionObserver observer2 = new TransactionObserver("Observador 2");

        transaction.addObserver(observer1);
        transaction.addObserver(observer2);

        System.out.println(transaction.process());
        System.out.println(transaction.approve());
        System.out.println(transaction.process());
        System.out.println(transaction.archive());
        System.out.println(transaction.approve());
        System.out.println(transaction.decline());
    }
}
