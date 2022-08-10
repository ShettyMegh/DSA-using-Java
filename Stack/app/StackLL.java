package app;

public class StackLL {
    class Node{
        int data;
        Node next;
        Node(int ele){
            this.data = ele;
            this.next = null;
        }
    }


    Node head;
    int top,max;

    public StackLL(int size){
        this.max = size;
        this.top = -1;
    }

    //isEmpty
    public boolean isEmpty(){
        return (top==-1);
    }

    //isFull
    public boolean isFull(){
        return (max==top+1);
    }

    //push
    public boolean push(int ele){
        if(isFull()) return false;
        Node newNode = new Node(ele);
        if(head==null){
            head = newNode;
            top++;
            return true;
        }

        newNode.next = head;
        head = newNode;
        top++;
        return true;
    }

    //pop
    public int pop(){
        if(isEmpty()) return -1;

        int res = head.data;
        head = head.next;
        top--;
        return res;

        
    }

    //peek
    public int peek(){
        if(isEmpty()) return -1;
        return head.data;
    }

    //print
    public void  printStack(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }

        Node current = head;

        while(current !=null){
            System.out.println(current.data);
            current = current.next;
        }
        
    }






}
