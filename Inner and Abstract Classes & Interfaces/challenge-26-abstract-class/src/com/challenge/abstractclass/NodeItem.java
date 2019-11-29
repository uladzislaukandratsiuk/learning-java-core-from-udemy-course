package com.challenge.abstractclass;

public class NodeItemList extends Node {

    public NodeItemList(Object data) {
        super(data);
    }

    @Override
    Node nextItem() {
        return this.next;
    }

    @Override
    Node setNextItem(Node item) {
        this.next = item;
        return this.next;
    }

    @Override
    Node previousItem() {
        return this.previous;
    }

    @Override
    Node setPreviousItem(Node item) {
        this.previous = item;
        return this.previous;
    }

    @Override
    int compareTo(Node item) {
        if(item != null) {
            return ((String) super.getData()).compareTo((String) item.getData());
        } else {
            return -1;
        }
    }
}
