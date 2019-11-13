package com.poorak.pie.year_two_thousand_nineteen.chapter4;

public class StackImpl implements Stack {
    private Node head;

    public StackImpl(final Node head) {
        if(head == null){
            throw new IllegalArgumentException("head can't be null");
        }
        this.head = head;
    }

    @Override
    public void push(String body) {
        if(body != null){
            Node node = new NodeImpl(body, head);
            head = node;
        }

        throw new IllegalArgumentException("body can't be null");
    }

    @Override
    public String pop() {
        if(head == null){
            throw new IllegalStateException("head is null");
        }
        Node response = head;
        head = head.getNext();
        return response.getValue();
    }
}
