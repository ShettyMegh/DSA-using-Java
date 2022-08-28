import packages.*;

public class Test {
    public static void main(String[] args) {
        CSLL csll = new CSLL();
        csll.addFront(22);
        csll.addFront(33);
        csll.addFront(11);
        csll.addFront(55);
        csll.printList();
        csll.addBack(33);
        csll.addBack(11);
        csll.printList();
        csll.addFront(401);
        csll.printList();


    }
}
