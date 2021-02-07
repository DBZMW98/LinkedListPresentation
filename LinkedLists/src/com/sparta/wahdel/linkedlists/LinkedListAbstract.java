package com.sparta.wahdel.linkedlists;

import java.util.LinkedList;

public abstract class LinkedListAbstract {
    private Node head;

    LinkedListAbstract() {
        this.head = null;
    }

    LinkedListAbstract(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return this.head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public abstract void add(Node node);

    public abstract void remove();

    public abstract void removeNode(Node node);

    public boolean isEmpty() {
        return head == null;
    }


}
