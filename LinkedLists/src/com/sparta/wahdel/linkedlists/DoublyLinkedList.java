package com.sparta.wahdel.linkedlists;

public class DoublyLinkedList extends LinkedListAbstract {
    private Node tail;

    public DoublyLinkedList() {
        this.setHead(null);
        this.tail = null;
    }

    public DoublyLinkedList(Node head) {
        this.setHead(head);
        this.tail = head;
    }

    public Node getTail() {
        return this.tail;
    }

    @Override
    public void add(Node node) {
        if (this.getHead() == null && tail == null) {
            this.setHead(node);
            this.getHead().setNextNode(null);
            this.getHead().setPrevious(null);
        } else {
            tail.setNextNode(node);
            tail.getNextNode().setPrevious(tail);
            tail = tail.getNextNode();
            tail.setNextNode(null);
        }
    }

    @Override
    public void remove() {
        if (!isEmpty()) {
            this.setHead(getHead().getNextNode());
            this.getHead().setPrevious(null);
        }

    }

    @Override
    public void removeNode(Node node) {
        if (!isEmpty()) {
            Node current = this.getHead();
            while (current.getData() != node.getData()) {
                if (current.getNextNode() == null) {
                    Printer.printErrorMessage("End of list reached. There is no value that matches.");
                    break;
                }
                current = current.getNextNode();
            }
            if (current.getData() == node.getData() ) {
                current.getNextNode().setPrevious(null);
                current.getPrevious().setNextNode(null);
                current.setPrevious(null);
                current.setNextNode(null);
            }
        }
    }
}
