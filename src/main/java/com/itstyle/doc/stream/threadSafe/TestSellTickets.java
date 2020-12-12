package com.itstyle.doc.stream.threadSafe;

import com.itstyle.doc.stream.threadSafe.interfacepackage.ParentTickets;
import com.itstyle.doc.stream.threadSafe.interfacepackage.SellTicket;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSellTickets {

    public static void main(String[] args) {
        ParentTickets tickets = new SellTicket();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 100; i++) {
            executorService.execute(tickets);
        }
    }
}
