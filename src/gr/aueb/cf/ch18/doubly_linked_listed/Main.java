package gr.aueb.cf.ch18.doubly_linked_listed;

import gr.aueb.cf.ch7.StrBuilderApp;

import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(9);

        System.out.println(list.toString());
        System.out.println("List");
        list.traverse();
        System.out.println();
        System.out.println("Reverse List");
        list.traverseReverse();
        System.out.println();

        Node<Integer> numNode = list.removeLast();

        int num = numNode.getItem();
        System.out.println("Last item value: " + num);
        System.out.println();

        Node<Integer> num2Node = list.removeFirst();
        int num2 = num2Node.getItem();
        System.out.println("First item value: " + num2 + "\n");


        System.out.println();
        System.out.println("List size: " + list.size());
    }
}
