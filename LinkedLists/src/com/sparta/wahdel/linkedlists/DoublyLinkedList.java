package com.sparta.wahdel.linkedlists;

public class DoublyLinkedList extends LinkedListAbstract
{
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public DoublyLinkedList(Node head) {
        this.head = head;
        this.tail = head;
    }

//    public Node getHead() {
//        return this.head;
//    }

    public Node getTail() {
        return this.tail;
    }

    @Override
    public void add(Node node) {
        if (head == null && tail == null) {
            this.head = node;
            this.head.setNextNode(null);
            this.head.setPrevious(null);
//        } else if (tail == null) {
//            Node current = this.head;
//            while (current.getNextNode() != null) {
//                current = current.getNextNode();
//            }
//            current.setNextNode(node);
//            current.getNextNode().setPrevious(current);
//            current.getNextNode().setNextNode(null);
        } else {
            tail.setNextNode(node);
            tail.getNextNode().setPrevious(tail);
            tail = tail.getNextNode();
            tail.setNextNode(null);
        }
    }

    @Override
    public void remove() {
        head = head.getNextNode();
        head.setPrevious(null);
    }

    public void remove(Node node) {
//        Node current;
//        while ()
    }
}
