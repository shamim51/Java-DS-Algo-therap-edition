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

    void insertIntoEnd(int value){

        Node newNode = new Node();

        newNode.data = value;
        newNode.next = null;

        if(head == null){
            head = newNode;
        }
        else {
            Node tNode = head;
            while (tNode.next != null){
                tNode = tNode.next;
            }
            tNode.next = newNode;
        }

    }

    void insertAfter(int oldValue, int newValue){
        if(head == null) return;

        Node newNode = new Node();
        newNode.data = newValue;
        newNode.next = null;

        Node currentNode = head;

        while (currentNode.next != null){
            if(currentNode.data == oldValue){
                Node nextNode = currentNode.next; //temporarily put the next node of current node into nextNode
                currentNode.next = newNode; //then put newNode after current Node
                newNode.next = nextNode; //then simply put nextNode after newNode.

                /*
                a simple visual representation:

                node-currentNode-nextNode-node-node
                node-currentNode-newNode-nextNode-node

                 */
            }
            currentNode = currentNode.next;
        }
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

        List.insertIntoEnd(5);
        List.insertIntoEnd(6);

        List.insertAfter(5, 7);

        List.printList();
    }
}
