package com.poorak.pie.year_two_thousand_nineteen.chapter4;

public interface Stack {
    interface Node{
        Node getNext();
        String getValue();
    }
    public void push(String body);
    public String pop();
}
