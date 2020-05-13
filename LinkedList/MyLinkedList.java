package PracticeQuestion.LinkedList;

public class MyLinkedList {
    Node head;

    public void printList() {              //printing linked list
        Node n = head;
        while (n != null) {
            System.out.println("LinkedList is:--" + n.data);
            n = n.next;
        }
    }
}
