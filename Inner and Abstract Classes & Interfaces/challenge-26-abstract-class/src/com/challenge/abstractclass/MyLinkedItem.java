package com.challenge.abstractclass;

public class MyLinkedItemList implements NodeList {

    private Node head = null;

    public MyLinkedItemList(Node head) {
        this.head = head;
    }

    @Override
    public Node getHead() {
        return this.head;
    }

    @Override
    public boolean addItem(Node newItem) {
        if(this.head == null) {
            // The list was empty, so this item becomes the head of the list
            this.head = newItem;
            return true;
        }

        Node currentItem = this.head;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison <0) {
                // newItem is greater, move right if possible
                if (currentItem.nextItem() != null) {
                    currentItem = currentItem.nextItem();
                } else {
                    // there is no next, so insert at end of list
                    currentItem.setNextItem(newItem).setPreviousItem(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less, insert before
                if (currentItem.previousItem() != null) {
                    currentItem.previousItem().setNextItem(newItem).setPreviousItem(currentItem.previousItem());
                    newItem.setNextItem(currentItem).setPreviousItem(newItem);
                } else {
                    // the node with a previous is the root
                    newItem.setNextItem(this.head).setPreviousItem(newItem);
                    this.head = newItem;
                }
                return true;
            } else {
                // equal
                System.out.println(newItem.getData() + " is already present, not added.");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(Node item) {
        return false;
    }

    @Override
    public void traverse(Node head) {
        if(head == null) {
            System.out.println("The list is empty");
        } else {
            while (head != null) {
                System.out.println(head.getData());
                head = head.nextItem();
            }
        }
    }
}
