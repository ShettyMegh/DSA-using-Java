package packages;

public class DLL {
    
    class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }

    }

    Node head;


    //print list
    public void printLL(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        if(head.next==null){
            System.out.println(head.data);
            return;
        }

        Node current = head;
        System.out.println("\n*************************************************");
        System.out.print("Null <==> ");
        while(current!=null){
            System.out.print(current.data+" <==> ");
            current = current.next;
        }

        System.out.println("Null");

        System.out.println("*************************************************");


    }
    
    //add from front
    public void addFront(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }

        newNode.next= head;
        head.prev = newNode;
        head = newNode;
    }


    //add from back
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
        newNode.prev = current;
    }

    //remove from front
    public int removeFront(){
        int temp;
        if(head==null){
            return -1;
        }

        if(head.next == null){
            temp = head.data;
            head = null;
            return temp;
        }


        temp = head.data;
        head = head.next;
        head.prev = null;
        return temp;
    }



    //remove from back
    public int removeBack(){
        int temp;
        if(head==null){
            return -1;
        }

        if(head.next == null){
            temp = head.data;
            head=null;
            return temp;
        }

        Node current = head;
        //loop upto last 2nd node
        while(current.next.next !=null){
            current = current.next;
        }
        temp = current.next.data;
        //break the connection
        current.next = null;
        return temp;
    }




}
