package PracticeQuestion.LinkedList;

public class MyMainLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.head = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);
        myLinkedList.head.next = second;
        second.next = third;
        myLinkedList.push(1);
        myLinkedList.append(5);
        myLinkedList.insertAfterNode(myLinkedList.head.next, 21);
        myLinkedList.printList();
    }


}
