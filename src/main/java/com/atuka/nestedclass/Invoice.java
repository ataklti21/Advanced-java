package com.atuka.nestedclass;

import java.util.ArrayList;

public class Invoice {
    private static class Item {
        //no matter where  making the instance
        // variables of the inner class private or not
        // they only access in side the Invoice Class.
        String description;
        Integer quantity;
        double unitPrice;

        double price() {
            return unitPrice * quantity;
        }
    }

    ArrayList<Item> items = new ArrayList<>();

    public void addItem(String description, Integer quantity, double unitPrice) {
        Item item = new Item();
        item.description = description;
        item.quantity = quantity;
        item.unitPrice = unitPrice;
        items.add(item);
        double price = item.price();
        System.out.println(price);
    }
}
