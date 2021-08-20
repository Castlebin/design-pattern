package com.heller.visitor;

public class VisitorPattern {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.addElement(new ConcreteElementA());
        os.addElement(new ConcreteElementB());

        os.accept(new ConcreteVisitorA());
        System.out.println("---------------------");
        os.accept(new ConcreteVisitorB());
    }
}
