package DesignPattern.Visitor.visitorImpl;

import DesignPattern.Visitor.Items.Book;
import DesignPattern.Visitor.Items.Fruit;
import DesignPattern.Visitor.Items.Pen;
import DesignPattern.Visitor.visitor.ShoppingCartVisitor;

public class GenerateReceiptVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        return 10;
    }

    @Override
    public int visit(Fruit fruit) {
        return 10;
    }

    @Override
    public int visit(Pen pen) {
        return 10;
    }
}
