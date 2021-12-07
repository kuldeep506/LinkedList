// Created by Intellij IDEA
// Author Name: KULDEEP SINGH (kuldeep506)
// Date: 28-11-2021

package singlylinkedlist;

public class SinglyLinkedList {

    public class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    private int length;

    public SinglyLinkedList() {
        this.head = null;
        this.length = 0;
    }

    public int getLength() {
        return length;
    }

    /** add node at the last of list*/
    public void add(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            length++;
        }
        else{
            Node temp=head;
            while(temp.next !=null){
                temp=temp.next;
            }
            temp.next=node;
            length++;
        }
    }

    /** display list*/
    public void display(){
        if (head==null){
            System.out.println("Empty");
        }else{
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        }
    }

    /** add node at the beginning of list */
    public void addFirst(int data){
        Node node =new Node(data);
        if (head ==null){
            head=node;
            length=1;
            return;
        }
        node.next=head;
        head=node;
        length++;
    }

    /** add node at given point of  of list */
    public void addAtPosition(int data,int position){
        int counter=1;
        Node node=new Node(data);
        if (head==null){
            System.out.println("list is Empty");
            return;
        }
        Node current=head;
        Node previous =head;
        while(counter!=position){
            previous=current;
            current=current.next;
            counter++;
        }
        previous.next=node;
        node.next=current;

    }

    /** delete first node from the list*/
    public void deleteFirst(){
        if (head==null){
            System.out.println("Empty");
            return;
        }
        if (head.next==null){
            head=null;
        }
        head=head.next;
    }

    /** delete last node of the linkedList */
    public void deleteLast() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node current=head;
        Node previous=head;
        while (current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
    }

    /** method to delete a node at given point*/
    public void deleteAtPosition(int position){
        int counter=1;
        if (head==null) {
            System.out.println("Empty");
            return;
        }
        if(position==1){
            head=null;
            return;
        }
        Node current = head;
        Node previous=head;
        while (counter!=position){
            previous=current;
            current=current.next;
            counter++;
        }
        previous.next=current.next;
    }

}
