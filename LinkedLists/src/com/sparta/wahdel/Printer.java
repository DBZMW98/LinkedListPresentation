package com.sparta.wahdel;

import com.sparta.wahdel.linkedlists.Node;

public class Printer {
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printLinkedList(Node node) {
        System.out.println("===============");
        System.out.println("Station 1: 1");
        System.out.println("Station 2: 2");
        System.out.println("Station 3: 3");
        System.out.println("Station 4: 4");
        System.out.println("Station 5: 5");
        System.out.println("Station 6: 6");
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNextNode();
        }
    }

    public static void printCircularLinkedList(Node node) {
        Node start = node;
        boolean stop = false;
        while (!stop) {
            System.out.println(node.getData());
            node = node.getNextNode();
            if (node == start) {
                stop = true;
            }
        }
    }

    public static void printErrorMessage(String message) {
        System.err.println(message);
    }
}
