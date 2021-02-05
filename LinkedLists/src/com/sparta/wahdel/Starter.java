package com.sparta.wahdel;

import com.sparta.wahdel.linkedlists.DoublyLinkedList;
import com.sparta.wahdel.linkedlists.LinkedListAbstract;
import com.sparta.wahdel.linkedlists.Node;

public class Starter {
    public static void start() {
        Node node = new Node(1);
        LinkedListAbstract dll = new DoublyLinkedList();
        LinkedListAbstract dll2 = new DoublyLinkedList(node);
        Printer.printLinkedList(dll.getHead());
//        LinkedLists.singleLinkedListJava();
//        LinkedLists.singleLinkedListNode();
//        LinkedLists.doublyLinkedList();
//        LinkedLists.circularLinkedList();
    }
}
