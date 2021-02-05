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

    public abstract void add(Node node);
    public abstract void remove();

}
