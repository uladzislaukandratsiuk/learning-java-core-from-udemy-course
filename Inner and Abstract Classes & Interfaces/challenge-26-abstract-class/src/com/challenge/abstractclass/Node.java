package com.challenge.abstractclass;

public abstract class Node {

    protected Object data;
    protected Node next;
    protected Node previous;

    public Node(Object data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    abstract Node nextItem();

    abstract Node setNextItem(Node item);

    abstract Node previousItem();

    abstract Node setPreviousItem(Node item);

    abstract int compareTo(Node item);

    public Object getData() {
        return data;
    }
}

