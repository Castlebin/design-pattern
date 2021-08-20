package com.heller.visitor;

/**
 * 具体的元素类B
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "具体元素类B的操作B";
    }
}
