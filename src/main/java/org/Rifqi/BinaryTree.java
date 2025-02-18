package org.Rifqi;

public class BinaryTree {
    private Node root;

    public BinaryTree(){
        root=null;
    }
    public void insert(int data){
        Node newNode = new Node(data,true);
        if (root==null){
            root = newNode;
        }
        Node current = root;
        Node parent = null;
        while (current !=null){
            parent = current;
            if (data< current.data){
                current=current.left;

            } else if (data> current.data) {
                current=current.right;
                
            }else {
                return;
            }


        }
        if (data< parent.data){
            parent.left=newNode;
        }else {
            parent.right=newNode;
        }
    }
    public boolean search(int data){
        Node current = root;
        while (current!=null){
            if (data == current.data){
                return true;
            } else if (data< current.data) {
                current = current.left;
            }else {
                current=current.right;
            }
        }
        return false;
    }
}
