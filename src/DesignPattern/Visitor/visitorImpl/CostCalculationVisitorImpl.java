package DesignPattern.Visitor.visitorImpl;

import DesignPattern.Visitor.Items.Book;
import DesignPattern.Visitor.Items.Fruit;
import DesignPattern.Visitor.Items.Pen;
import DesignPattern.Visitor.visitor.ShoppingCartVisitor;

public class CostCalculationVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        int cost=0;
        //apply 5$ discount if book price is greater than 50
        if(book.getPrice() > 50){
            cost = book.getPrice()-5;
        }
        else
            cost = book.getPrice();
        System.out.println("Book ISBN::"+book.getIsbnNumber() + " cost ="+cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg()*fruit.getWeight();
        System.out.println(fruit.getName() + " cost = "+cost);
        return cost;
    }

    @Override
    public int visit(Pen pen) {
        int cost = pen.getCost();
        int costAfterDiscount = (int) (cost*0.8);
        System.out.println(costAfterDiscount);
        return costAfterDiscount;
    }

}

