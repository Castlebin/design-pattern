package com.heller.visitor;

/**
 * 抽象的访问者
 *
 * 依赖了 具体的 被访问元素类   （破坏了封装、违反了开闭原则、违反了依赖倒置原则）
 */
public interface Visitor {

    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);

}
