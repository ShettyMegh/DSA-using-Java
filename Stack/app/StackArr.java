package app;

public class StackArr {
    private int top,max;
    int arr[];

    public StackArr(int size){
        arr = new int [size];
        max = size;
        top=-1;
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
            top++;
            arr[top] = ele;
            return true;
        }
    
        //pop
        public int pop(){
            if(isEmpty()) return -1;
            int temp = arr[top];
            top--;
            return temp;
        }

        //peek
        public int peek(){
            return top!=-1 ? arr[top]:top;
        }
        //print stack
        public void printStack(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return;
            }

            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
}


