package com.example.sample.DSA;

import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedListt l1 = new LinkedListt();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.traversalThroughTheList(l1.head);
    }
}
class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class LinkedListt
{
    Node head;
    public void add(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
        }
        else {
            Node current = head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void traversalThroughTheList(Node head)
    {
        Node current = head;

        while (current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}