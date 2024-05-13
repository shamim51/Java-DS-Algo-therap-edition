package data_structure.linked_list;

class Node{
    int data;
    Node next;
}
public class SinglyLinkedList {
    Node head;

    void insertIntoFront(int value){
        Node newNode = new Node();
        newNode.data = value;

        newNode.next = head;
        head = newNode;
    }

    void printList(){
        Node cNode = head;
        while (cNode != null){
            System.out.println(cNode.data);
            cNode = cNode.next;
        }
    }
}

class Main{
    public static void main(String[] args) {
        SinglyLinkedList List = new SinglyLinkedList();

        List.insertIntoFront(1);
        List.insertIntoFront(2);

        List.printList();
    }
}
