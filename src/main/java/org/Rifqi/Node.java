package org.Rifqi;

public class Node {
    int data;
    Node next;
    Node left;
    Node right;
    Node (int data){
        this.data = data;
        this.next=null;
    }
    Node(int data,boolean isBT){
        this.data=data;
        if (isBT){
            this.left=null;
            this.right=null;
        }
    }
}
