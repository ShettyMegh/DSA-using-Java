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

 

}
