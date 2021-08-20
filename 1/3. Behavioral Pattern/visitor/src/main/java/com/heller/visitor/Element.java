package com.heller.visitor;

/**
 * 抽象的 被访问元素类
 */
public interface Element {

    void accept(Visitor visitor);

}
