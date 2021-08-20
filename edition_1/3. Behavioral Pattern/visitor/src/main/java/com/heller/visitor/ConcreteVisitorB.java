package com.heller.visitor;

/**
 * 具体的访问者 B
 */
public class ConcreteVisitorB implements Visitor {
    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("访问者B 操作 " + element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("访问者B 操作 " + element.operationB());
    }
}
