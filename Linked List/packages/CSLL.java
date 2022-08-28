package packages;

public class CSLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }

        Node head,tail;



        //print list
        public void printList(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }

            Node current = head;

            while(current.next != head){
                System.out.print(current.data+" -> ");
                current = current.next;
            }
            System.out.println(tail.next.data+"(head)");


        }

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



          //add from back
          public void addBack(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = tail = newNode;
                return;
            }

           tail.next = newNode;
           tail = newNode;
           tail.next = head;
        }


    }
