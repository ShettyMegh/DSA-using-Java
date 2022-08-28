package packages;

public class CSLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

        Node head,tail;


        //add from front
        public void addFront(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = tail = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
            tail.next = head;
        }

    }
}
