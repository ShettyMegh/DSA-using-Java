package packages;

public class SLL {


    //Node creation
    private class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    private Node head;


    //print SLL
    public void printLL(){

        if(head == null){
            System.out.println("LL is Empty");
            return;
        }

        Node current = head;

        //optional
        // System.out.println("\nhead");
        // System.out.println(" | ");
        // System.out.println("\\ /");

        //print until current becomes null
        while(current !=null){
            System.out.print(" "+current.data+" -> ");
            current = current.next;
        }

        System.out.print("Null");
    }



    //Add front
    public void addFront(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            return;
        }

        
        newNode.next = head;
        head = newNode;
    }



    //add back
    public void addBack(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }

        Node current = head;

        while(current.next !=null){
            current = current.next;
        }

        current.next = newNode;
    }



    //Remove from front
    public int removeFront(){
        if(head == null){
            return -1;
        }

            int temp  = head.data;
            head = head.next;
            return temp;
    }



    //remove last
    public int removeBack(){

        //incase if there is no node
        if(head == null){
            return -1;
        }


        //incase if there is only one node
        if(head.next == null){
            int temp = head.data;
            head = null;
            return temp;
        }


        //if there is more than one node
        Node current = head;

        while(current.next.next !=null){
            current = current.next;
        }

        int temp = current.next.data;
        current.next = null;
        return temp;

    }


}
