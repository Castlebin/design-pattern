package com.heller.visitor;

/**
 * 具体的元素类A
 */
public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "具体元素类A的操作A";
    }
}
