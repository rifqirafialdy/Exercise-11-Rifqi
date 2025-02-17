package org.Rifqi;

public class Queue {
    private Node front;
    private Node rear;

    public Queue(){
        this.front=null;
        this.rear=null;
    }
    public void enque(int data){
        Node newNode = new Node(data);
        if (rear==null){
            front=rear=newNode;
            return;
        }
rear.next=newNode;
        rear=newNode;
        }
        public int deque(){
            if (front==null){
                throw new IllegalArgumentException("Queue Empty ! Cannot deque !");
            }
            int dequeData = front.data;
            front=front.next;
            if (front==null){
                rear=null;
            }
            return dequeData;
        }
    public int peek(){
        if (front==null){
            throw new IllegalArgumentException("Queue Empty ! Cannot PEEK !");
        }
        return front.data;
    }
    }

