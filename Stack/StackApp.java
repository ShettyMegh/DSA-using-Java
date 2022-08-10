import java.util.Scanner;
import app.StackArr;

public class StackApp{

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Stack App");
        boolean flag = true;
        while(flag){
            System.out.println("1. Stack using Array");
            System.out.println("2. Stack using Linked List");
            System.out.println("3. Change Stack size");
            System.out.println("4. Exit");
            System.out.print("Choose your option: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    arrStack();
                    break;

                case 2:
                    break;

                case 3:
                    break;
                case 4: 
                    System.out.println("Exiting App...");
                    flag = false;
                    break;

                default: System.out.println("Wrong choice");
                        break;
            }


        }


    }


    //for stack using array interface
    public static void arrStack(){
        boolean arrFlag = true;
        int size;
        System.out.println("Enter size of Stack");
        size = sc.nextInt();
        StackArr stackArr = new StackArr(size);
        while(arrFlag){
            System.out.println("1.Push  2.Pop  3.Print  4.Peek  5.Go Back");
            int choice = sc.nextInt();
            int res;
            switch(choice){
                case 1: System.out.print("Enter an Element to Push: ");
                        int ele = sc.nextInt();
                        if(stackArr.push(ele)){
                            System.out.println(ele+" pushed successfully");
                            break;
                        }
                        System.out.println("Stack Overflow");
                        break;

                case 2: res = stackArr.pop();
                        if(res == -1){
                            System.out.println("Stack is Underflow");
                            break;
                        }
                        System.out.println(res+" popped successfully");
                        break;
                
                case 3: stackArr.printStack();
                        break;

                case 4:
                        res = stackArr.peek();
                        if(res != -1){
                            System.out.println("Peek: "+res);
                            break;
                        }

                        System.out.println("Stack is Empty");
                        break;

                case 5:
                        arrFlag = false;
                        break;
                
                default: System.out.println("Wrong choice");
                        break;
            }
        }
    }
}

