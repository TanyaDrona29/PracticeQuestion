package PracticeQuestion.LinkedList;

public class MyLinkedList {
    Node head;

    public void push(int newData) {                 //adding new node at front
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void append(int newData) {              //adding new node at end
        Node newNode = new Node(newData);
        if (head == null) {
            head = new Node(newData);
            return;
        }
        newNode.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        return;
    }

    public void insertAfterNode(Node preNode, int newData) {               //adding new node at a given position
        if (preNode == null) {
            System.out.println("previous node cannot be null");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = preNode.next;
        preNode.next = newNode;
    }

    public void printList() {              //printing linked list
        Node n = head;
        System.out.println("linked list is --->");
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
