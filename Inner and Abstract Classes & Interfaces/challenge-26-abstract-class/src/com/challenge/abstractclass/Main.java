package com.challenge.abstractclass;

public class Main {

    public static void main(String[] args) {
        MyLinkedItem list = new MyLinkedItem(null);
        list.traverse(list.getHead());

        String stringData = "5 7 3 9 8 2 1 0 4 6";

        String[] data = stringData.split(" ");
        for (String s : data) {
            list.addItem(new NodeItem(s));
        }

        list.traverse(list.getHead());
        list.removeItem(new NodeItem("3"));
        list.traverse(list.getHead());

        list.removeItem(new NodeItem("5"));
        list.traverse(list.getHead());

        list.removeItem(new NodeItem("0"));
        list.removeItem(new NodeItem("4"));
        list.removeItem(new NodeItem("2"));
        list.traverse(list.getHead());

        list.removeItem(new NodeItem("9"));
        list.traverse(list.getHead());
        list.removeItem(new NodeItem("8"));
        list.traverse(list.getHead());
        list.removeItem(new NodeItem("6"));
        list.traverse(list.getHead());
        list.removeItem(list.getHead());
        list.traverse(list.getHead());
        list.removeItem(list.getHead());
        list.traverse(list.getHead());
    }

}
