package packages;

public class CDLL {

    //Node creation
    class Node{
        int data;
        Node next,prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head,tail;

    //print list
    public void printLL(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        if(head==tail){
            System.out.println(head.data+"=> Null");
            return;
        }

        Node current = head;

        do{
            System.out.print(current.data+" <=> ");
            current = current.next;
        } while(current != head);

        System.out.println("(head)"+current.data);
    }

    //add from front
    public void addFront(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        tail.next = head;
        head.prev = tail;

    }


    //add from back
    public void addBack(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        tail.next = head;
        head.prev = tail;
        
    }

}