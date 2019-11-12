package com.poorak.pie.year_two_thousand_nineteen.chapter4;

public class NodeImpl implements Stack.Node {
    private final String value;
    private final Stack.Node next;

    public NodeImpl(String value, Stack.Node next) {
        this.value = value;
        this.next = next;
    }


    @Override
    public Stack.Node getNext() {
        return next;
    }

    @Override
    public String getValue() {
        return value;
    }
}
