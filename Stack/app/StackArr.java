package Stack.app;

public class StackArr {
    private int top,max;
    int arr[];
    StackArr(int size){
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
    
    
        //pop

    //print stack
    public void printStack(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }

        for (int i = 0; i <= top; i++) {
            System.out.println(arr[top]);
        }
    }
}


