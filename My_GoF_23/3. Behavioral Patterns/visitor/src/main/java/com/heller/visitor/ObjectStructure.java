package com.heller.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构角色
 */
public class ObjectStructure {

    private List<Element> elements = new ArrayList<>();

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }

    public void addElement(Element element) {
        elements.add(element);
    }

    public void remove(Element element) {
        elements.remove(element);
    }

}
