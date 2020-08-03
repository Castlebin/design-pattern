package com.heller.visitor;

/**
 * 具体的访问者 A
 */
public class ConcreteVisitorA implements Visitor {
    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("访问者A 操作 " + element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("访问者A 操作 " + element.operationB());
    }
}
