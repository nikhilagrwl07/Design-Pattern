package DesignPattern.Visitor.visitor;

import DesignPattern.Visitor.Items.Book;
import DesignPattern.Visitor.Items.Fruit;
import DesignPattern.Visitor.Items.Pen;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
    int visit(Pen pen);
}
