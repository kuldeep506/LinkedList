// Created by Intellij IDEA
// Author Name: KULDEEP SINGH (kuldeep506)
// Date: 06-12-2021

package doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.add(2);
        list.add(7);
        list.add(8);
        list.add(5);
        list.add(9);
//        list.addAtPosition(3,6);
//        list.deleteFirst();
        list.deleteAtPosition(2);
        list.print();
    }
}
