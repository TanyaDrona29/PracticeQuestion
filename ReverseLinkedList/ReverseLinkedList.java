package PracticeQuestion.ReverseLinkedList;

public class ReverseLinkedList {
    Node startNode = null;

    public static void main(String[] args) {
        new ReverseLinkedList();
    }

    public void getLinkedList() {
        //getting elements of singly linked list
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        //setting elements to singly linked list
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
    }
}
