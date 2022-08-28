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
        public void printLL(){

            //incase list is empty
            if(head==null){
                System.out.println("List is empty");
                return;
            }

            //incase if there is only one node
            if(head == tail){
                System.out.println(head.data);
                return;
            }

            Node current = head;

            //print all list
            do{
                System.out.print(current.data+" -> ");
                current = current.next;
            }
            while(current != head);
                
            System.out.println("(head) "+tail.next.data);


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

        //remove from front
        public int removeFront(){
            int temp;

            //incase list is empty
            if(head == null){
                return -1;
            }

            //if there is only one node
            if(head == tail){
                temp = head.data;
                head = tail = null;
                return temp;
            }


            //point head to its next node and point tail.next to head
            temp = head.data;
            head = head.next;
            tail.next = head;
            return temp;
        }


        public int removeBack(){
            int temp;

            //incase list is empty
            if(head == null){
                return -1;
            }

            //if there is only one node
            if(head == tail){
                temp = tail.data;
                head = tail = null;
                return temp;
            }

            
            Node current = head;
            //loop upto tail previous node
            while(current.next != tail){
                current = current.next;
            }

            //then remove tail node and point tail to its previous node
            temp  = tail.data;
            current.next = head;
            tail = current;

            return temp;
        }

    }
