package com.heller.visitor;

/**
 * 抽象的元素类
 */
public interface Element {

    void accept(Visitor visitor);

}
