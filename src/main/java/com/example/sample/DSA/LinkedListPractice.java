package com.example.sample.DSA;
//
//class Node
//{
//    int data;
//    Node next;
//
//    public Node(int data)
//    {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class LinkedList
//{
//    private Node head;
//
//    public void add(int data)
//    {
//        Node newNode = new Node(data);
//        if(head == null)
//        {
//            head = newNode;
//        }
//        else
//        {
//            Node current = head;
//            while(current.next != null)
//            {
//                current = current.next;
//            }
//            current.next = newNode;
//        }
//    }
//
//    public void display()
//    {
//        Node current = head;
//        while(current != null)
//        {
//            System.out.print(current.data + " ");
//            current = current.next;
//        }
//        System.out.println();
//    }
//}
//
//public class LinkedListPractice
//{
//    public static void main(String[] args) {
//        LinkedList l1 = new LinkedList();
//        l1.add(10);
//        l1.add(20);
//        l1.add(30);
//        l1.add(40);
//        l1.add(50);
//        l1.display();
//    }
//}


public class LinkedListPractice {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(7);
        l1.add(12);
        l1.add(9);
        l1.add(19);
        l1.add(55);
        l1.display();
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

class LinkedList
{
    private Node head;

//    This method adds a new Node with data at the end of the list. Takes in data as parameter and returns nothing.
    public void add(int data)
    {
//        Create a new Node which has to inserted and the construtor initializes the give data and next to null.
        Node newNode = new Node(data);

//        If the list is empty or not checking. head is the reference to the first Node. if the list is empty
//        ead will become newNode ie newNode is the first Node of the list
        if(head == null)
        {
            head = newNode;
        }

//      if the list is not empty traverse to the last Node. Variable current of the type Node is initialized to
//      head of the Node and it is put inside the loop to traverse to the end of the list
        else {
            Node current = head;
            while(current.next != null)
            {
                current = current.next;
            }

//          Now after the traversel to the end of the list make the next variable to the newNode.
            current.next = newNode;
        }
    }

//    Method to display the linked list. Returns nothing because prints the list by itself
    public void display()
    {
//        initializing current variable of type Node to head.
        Node current = head;
//        till current is not null while loop needs to execute
        while(current != null)
        {
//            Since current Node contains both data and adress of next Node data part will be printed
            System.out.print(current.data + " ");
//            Updating the next in this statement, so that data of next Node be printed
            current = current.next;
        }
        System.out.println();
    }
}

