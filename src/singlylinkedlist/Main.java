// Created by Intellij IDEA
// Author Name: KULDEEP SINGH (kuldeep506)
// Date: 28-11-2021

package singlylinkedlist;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list=new SinglyLinkedList();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(8);
//        list.addFirst(9);
//        list.addAtPosition(7,3);
//        list.deleteFirst();
//        list.deleteLast();
        list.deleteAtPosition(2);
        list.display();

    }
}
