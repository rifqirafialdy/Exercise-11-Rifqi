package org.Rifqi;

public class Stack {
private Node top;
public Stack(){
    this.top=null;
}
public void push(int data ){
    Node newNode= new Node(data);
    newNode.next=top;
    top=newNode;
}
public int pop(){
    if (top==null){
        throw new IllegalArgumentException("Stack Empty ! Cannot POP !");
    }
    int popData= top.data;
    top = top.next;
    return popData;
}
public int peek(){
    if (top==null){
        throw new IllegalArgumentException("Stack Empty ! Cannot PEEK !");
    }
    return top.data;
}
}
