package DesignPattern.Visitor;

import DesignPattern.Visitor.visitor.ShoppingCartVisitor;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
