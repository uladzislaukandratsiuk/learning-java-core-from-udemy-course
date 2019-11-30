package com.challenge.abstractclass;

public interface NodeList {

    Node getHead();

    boolean addItem(Node item);

    boolean removeItem(Node item);

    void traverse(Node root);
}
