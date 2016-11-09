package com.command.pattern;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orders = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders(){
        for (Order order : orders) {
            order.execute();
        }

        orders.clear();
    }
}
