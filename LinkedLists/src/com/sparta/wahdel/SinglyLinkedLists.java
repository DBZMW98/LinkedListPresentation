package com.sparta.wahdel;

public class SinglyLinkedLists {
    private Node head;

    // Constructors
    public SinglyLinkedLists() {
       this.head = null;
    }

    public SinglyLinkedLists(Node head) {
        this.head = head;
    }

    /**
     * Adding a node object to the linked list
     * @param node The node object to add
     */
    public void add(Node node) {
        // Check if the list is empty
        if (head == null) {
            this.head = node;
        } else {
            Node current = head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(node);
            node.setPrevious(current);
        }
    }

    /**
     * Add a new Node object at a specified index
     * @param node The node to add
     * @param index The index position in the Linked List
     */
    public void add(Node node, int index) {
        if (head == null) {
            this.head = node;
        } else {
            Node current = head;
            while (index > 0) {
                current = head.getNextNode();
                index--;
            }
            Node temp = current.getNextNode();
            current.setNextNode(node);
            node.setNextNode(temp);
        }
    }

    /**
     * Removes a node from the head of the Linked list
     */
    public void removeNode() {
        if (!isEmpty()) {
            Node temp = head.getNextNode();
            head = temp;
        }
    }

    /**
     * Removes the first Node object that matches the passed Node object
     * @param node The node object to remove
     */
    public void removeNode(Node node) {
        if (!isEmpty()) {
            Node current = head;
            while (current.getData() != node.getData()) {
                if (current.getNextNode() == null) {
                    Printer.printErrorMessage("End of list reached. There is no value that matches.");
                    break;
                }
                current = current.getNextNode();
            }
            Node temp = head.getNextNode();
            head = temp;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}
