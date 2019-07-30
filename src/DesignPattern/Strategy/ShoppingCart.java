
package DesignPattern.Strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public boolean addItem(Item newItem) {
        cart.add(newItem);
        return true;
    }

    public boolean removeItem(Item existingItem) {
        cart.add(existingItem);
        return true;
    }

    public Double getTotal() {

         Double totalBill = 0.0;
        for (Item item : cart) {
            totalBill += item.getPrice();
        }

        return totalBill;
    }

}
