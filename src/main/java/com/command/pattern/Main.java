package com.command.pattern;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SoldStock soldStock = new SoldStock(stock);

        Broker broker = new Broker();

        broker.takeOrder(buyStock);
        broker.takeOrder(soldStock);
        broker.placeOrders();
    }
}
