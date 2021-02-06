package com.sparta.wahdel;

public class Starter {
    public static void start() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        DoublyLinkedList dll = new DoublyLinkedList(node1);
        Printer.printLinkedList(dll.getHead());
        dll.add(node2);
        dll.add(node3);
        dll.add(node4);
        dll.remove();
        //dll.removeNode(node1);
        dll.removeNode(node6);
        dll.removeNode(node5);
        Printer.printLinkedList(dll.getHead());

    }
}
