package org.example;

import org.example.Context.Transaction;

public class Main {
    public static void main(String[] args) {
        Transaction transaction = new Transaction();

        System.out.println(transaction.process());
        System.out.println(transaction.approve());

        System.out.println(transaction.process());

        System.out.println(transaction.archive());

        System.out.println(transaction.approve());

        System.out.println(transaction.decline());
    }
}

