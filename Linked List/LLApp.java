import java.util.Scanner;

import packages.SLL;

class LLApp{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        
        System.out.println("Welcome to Linked List App");

        boolean flag = true;

        while(flag){
            System.out.println("1.Singly Linked List \t 2.Circular Singly Linked List \n3.Doubly Linked List \t 4.Double Circular Linked List \n5.Exit");
            System.out.print("Enter you choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    SLLOperations();
                    break;

               

                case 5:
                    flag = false;
                    break;
                    
                default:
                    break;
            }
        }




    }



    static void SLLOperations(){
        boolean flag = true;
        SLL singly = new SLL();
        while(flag){
            System.out.println("\nSingly Linked List Operations: ");
            System.out.println("1.Add Front \t 2.Add Back \t 3.Remove Front \t 4.Remove Back \t 5.Print List \t 6.Go Back");
            System.out.print("Enter your choice: ");
            System.out.println();
            int choice = sc.nextInt();
            int data,res;
            switch(choice){
                
                case 1:
                    System.out.println("Enter the Data: ");
                    int data1 = sc.nextInt();
                    System.out.println(data1);
                    singly.addFront(data1);
                    System.out.println("Added Front Successfully");
                    break;

                case 2:
                    System.out.println("Enter the Data: ");
                    data = sc.nextInt();
                    singly.addBack(data);
                    System.out.println("Added Back Successfully");
                    break;

                case 3:
                    res = singly.removeFront();
                    System.out.println(res);
                    System.out.println(res==-1?"List is Empty":res+" is Removed from front");
                    break;
                
                case 4:
                    break;

                case 5:
                    singly.printLL();
                    break;

                case 6:
                    flag=false;
                    break;


                default:
                    System.out.println("Wrong Choice");
            }

        }
    }
}

