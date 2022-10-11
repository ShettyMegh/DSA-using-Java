import java.util.Scanner;

import packages.*;

class LLApp{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        
        System.out.println("Welcome to Linked List App");

        boolean flag = true;

        while(flag){
            System.out.println("1.Singly Linked List \t 2.Circular Singly Linked List \n3.Doubly Linked List \t 4.Doubly Circular Linked List \n5.Exit");
            System.out.print("Enter you choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    SLLOperations();
                    break;

                case 2:
                    CSLLOperations();
                    break;
               
                case 3:
                    DLLOperations();
                    break;

                case 4:
                    CDLLOperations();
                    break;

                case 5:
                    System.out.println("Exiting..");
                    flag = false;
                    break;
                    
                default: System.out.println("Wrong Choice");
                    break;
            }
        }

 


    }



    //Singly Linked List
    static void SLLOperations(){
        boolean flag = true;
        SLL singly = new SLL();
        while(flag){
            System.out.println("\nSingly Linked List Operations: ");
            System.out.println("1.Add Front \t 2.Add Back \t 3.Remove Front \t 4.Remove Back \t 5.Print List \t 6.Add At Index \t 7.Go Back");
            System.out.print("Enter your choice: ");
            System.out.println();
            int choice = sc.nextInt();
            int data,res,idx;
            switch(choice){
                
                case 1:
                    System.out.println("Enter the Data: ");
                    data = sc.nextInt();
                    singly.addFront(data);
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
                    System.out.println(res==-1?"List is Empty":res+" is Removed from front");
                    break;
                
                case 4:
                    res = singly.removeBack();
                    System.out.println(res==-1?"List is Empty":res+" is Removed from Back");
                    break;

                case 5:
                    singly.printLL();
                    break;

                case 6:
                    System.out.println("Enter the Index: ");
                    idx = sc.nextInt();
                    System.out.println("Enter the data: ");
                    data = sc.nextInt();
                    if(!singly.addAtIdx(idx, data)){
                        System.out.println("Index value is greater than Max Index.");
                        break;
                    }
                    System.out.println("Data inserted At index "+idx+" successfully");
                    break;

                case 7:
                    System.out.println("Going Back..");
                    flag=false;
                    break;


                default:
                    System.out.println("Wrong Choice, please try again");
            }

        }

    }


    //Circular Singly Linked List
    static void CSLLOperations(){
        boolean flag = true;
        CSLL cirSingly = new CSLL();
        while(flag){
            System.out.println("\nCircular Singly Linked List Operations: ");
            System.out.println("1.Add Front \t 2.Add Back \t 3.Remove Front \t 4.Remove Back \t 5.Print List \t 6.Go Back");
            System.out.print("Enter your choice: ");
            System.out.println();
            int choice = sc.nextInt();
            int data,res;
            switch(choice){
                
                case 1:
                    System.out.println("Enter the Data: ");
                    data = sc.nextInt();
                    cirSingly.addFront(data);
                    System.out.println("Added at Front Successfully");
                    break;

                case 2:
                    System.out.println("Enter the Data: ");
                    data = sc.nextInt();
                    cirSingly.addBack(data);
                    System.out.println("Added at Back Successfully");
                    break;

                case 3:
                    res = cirSingly.removeFront();
                    System.out.println(res==-1?"List is Empty":res+" is Removed from front");
                    break;
                
                case 4:
                    res = cirSingly.removeBack();
                    System.out.println(res==-1?"List is Empty":res+" is Removed from Back");
                    break;
   
                case 5:
                    cirSingly.printLL();
                    break;

                case 6:
                    System.out.println("Going Back..");
                    flag=false;
                    break;


                default:
                    System.out.println("Wrong Choice, please try again");
            }

        }

    }


     //Doubly Linked List
     static void DLLOperations(){
        boolean flag = true;
        DLL doubly = new DLL();
        while(flag){
            System.out.println("\nDoubly Linked List Operations: ");
            System.out.println("1.Add Front \t 2.Add Back \t 3.Remove Front \t 4.Remove Back \t 5.Print List \t 6.Go Back");
            System.out.print("Enter your choice: ");
            System.out.println();
            int choice = sc.nextInt();
            int data,res;
            switch(choice){
                
                case 1:
                    System.out.println("Enter the Data: ");
                    data = sc.nextInt();
                    doubly.addFront(data);
                    System.out.println("Added at Front Successfully");
                    break;

                case 2:
                    System.out.println("Enter the Data: ");
                    data = sc.nextInt();
                    doubly.addBack(data);
                    System.out.println("Added at Back Successfully");
                    break;

                case 3:
                    res = doubly.removeFront();
                    System.out.println(res==-1?"List is Empty":res+" is Removed from front");
                    break;
                
                case 4:
                    res = doubly.removeBack();
                    System.out.println(res==-1?"List is Empty":res+" is Removed from Back");
                    break;
   
                case 5:
                    doubly.printLL();
                    break;

                case 6:
                    System.out.println("Going Back..");
                    flag=false;
                    break;


                default:
                    System.out.println("Wrong Choice, please try again");
            }

        }

    }


    //Circular Doubly Linked List
    static void CDLLOperations(){
        boolean flag = true;
        CDLL cirDoubly = new CDLL();
        while(flag){
            System.out.println("\nCircular Doubly Linked List Operations: ");
            System.out.println("1.Add Front \t 2.Add Back \t 3.Remove Front \t 4.Remove Back \t 5.Print List \t 6.Go Back");
            System.out.print("Enter your choice: ");
            System.out.println();
            int choice = sc.nextInt();
            int data,res;
            switch(choice){
                
                case 1:
                    System.out.println("Enter the Data: ");
                    data = sc.nextInt();
                    cirDoubly.addFront(data);
                    System.out.println("Added at Front Successfully");
                    break;

                case 2:
                    System.out.println("Enter the Data: ");
                    data = sc.nextInt();
                    cirDoubly.addBack(data);
                    System.out.println("Added at Back Successfully");
                    break;

                case 3:
                    res = cirDoubly.removeFront();
                    System.out.println(res==-1?"List is Empty":res+" is Removed from front");
                    break;
                
                case 4:
                    res = cirDoubly.removeBack();
                    System.out.println(res==-1?"List is Empty":res+" is Removed from Back");
                    break;
    
                case 5:
                    cirDoubly.printLL();
                    break;

                case 6:
                    System.out.println("Going Back..");
                    flag=false;
                    break;


                default:
                    System.out.println("Wrong Choice, please try again");
            }

        }

    }

}
