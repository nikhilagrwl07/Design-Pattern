package DesignPattern.Visitor;

import DesignPattern.Visitor.Items.Book;
import DesignPattern.Visitor.Items.Fruit;
import DesignPattern.Visitor.visitor.ShoppingCartVisitor;
import DesignPattern.Visitor.visitorImpl.CostCalculationVisitorImpl;
import DesignPattern.Visitor.visitorImpl.GenerateReceiptVisitorImpl;

public class ShoppingCartClient {

    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]
                {
                new Book(20, "1234"),
                new Book(100, "5678"),
                new Fruit(10, 2, "Banana"),
                new Fruit(5, 5, "Apple")
                };

        int total = calculatePrice(items);
        System.out.println("Total Cost = "+total);

        int totalQuantity = generateReceipt(items);
        System.out.println("Total totalQuantity = "+totalQuantity);
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new CostCalculationVisitorImpl();
        int sum=0;
        for(ItemElement item : items){
            sum = sum + item.accept(visitor);
        }
        return sum;
    }

    private static int generateReceipt(ItemElement[] items) {
        ShoppingCartVisitor shoppingCartVisitor = new GenerateReceiptVisitorImpl();
        int totalQuantity=0;
        for(ItemElement item : items){
            totalQuantity = totalQuantity + item.accept(shoppingCartVisitor);
        }

        return totalQuantity;
    }


}
