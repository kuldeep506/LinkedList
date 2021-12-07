// Created by Intellij IDEA
// Author Name: KULDEEP SINGH (kuldeep506)
// Date: 04-12-2021

package doublylinkedlist;


public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public class Node{
        private Node next;
        private Node previous;
        private int data;

        public Node( int data) {
            this.next = null;
            this.previous = null;
            this.data = data;
        }
    }

    /** method to add a node in list*/
    public void add(int data){
        Node node =new Node(data);
        if (head==null){
            head=tail=node;
            return;
        }
        if (head.next==null) {
            tail=node;
            tail.previous=head;
            head.next=tail;
            return;
        }
        Node temp=tail;
        temp.next=node;
        temp.previous=temp;
        tail=node;
    }

    /** method to print the list*/
    public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
    }

    /** method to add a node at given position*/
    public void addAtPosition(int position,int data){
        Node node =new Node(data);
        int counter=1;
        Node current=head;
        Node previous=head;
        while (counter!=position){
            previous=current;
            current=current.next;
            counter++;
        }
        previous.next=node;
        node.previous=previous;
        node.next=current;
        current.previous=node;
    }

    /** Delete a Node from start of a List*/
    public void deleteFirst(){
        head= head.next;
        head.previous=null;
    }

    /** Delete a Node from end of a List*/
    public void deleteLast(){
        tail= tail.previous;
        tail.next=null;
    }

    /** Delete a Node from given position from a List*/
    public void deleteAtPosition(int position){
        int counter=1;
        Node current=head;
        Node previous=head;
        while (counter!=position){
            previous=current;
            current=current.next;
            counter++;
        }
        previous.next=current.next;
        current.next.previous=previous;
    }
}
