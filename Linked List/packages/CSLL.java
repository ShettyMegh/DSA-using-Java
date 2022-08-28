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

            if(head == tail){
                System.out.println(head.data);
                return;
            }

            Node current = head;

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
            if(head == null){
                return -1;
            }

            if(head == tail){
                temp = head.data;
                head = tail = null;
                return temp;
            }

            temp = head.data;
            head = head.next;
            tail.next = head;
            return temp;
        }


    }
