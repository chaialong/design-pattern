package com.command.pattern;

public class SoldStock implements Order {
    private Stock stock;

    public SoldStock(Stock stock) {
        this.stock = stock;
    }

    public void execute() {
        stock.sell();
    }
}
