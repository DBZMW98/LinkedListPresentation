package com.sparta.wahdel.linkedlists;

import java.util.LinkedList;

public class CircularLinkedList extends LinkedListAbstract{
    private Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    public CircularLinkedList(Node head) {
        this.head = head;
    }

    @Override
    public void add(Node node) {
        if (this.head == null) {
            this.head = node;
            this.head.setNextNode(head);
        } /*else {

        }*/
    }

    @Override
    public void remove() {

    }
}
