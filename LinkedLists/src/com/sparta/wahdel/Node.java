package com.sparta.wahdel;

public class Node {
    int data;
    private Node nextNode;
    private Node previous;
    Node(int data){
        this.data = data;
        this.nextNode = null;
    }
    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node node) {
        this.nextNode = node;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getPrevious() {
        return this.previous;
    }

    public void setPrevious(Node node) {
        this.previous = node;
    }
}

