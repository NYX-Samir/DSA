package Circular;

public class Main {
    public static void main(String[] args) {
        circularLinkedList cl=new circularLinkedList();
        cl.insertAtFirst(10);
        cl.insertAtFirst(20);
        cl.insertAtFirst(30);
        cl.insertAtFirst(40);
        cl.Frontprint();
        cl.Backprint();
        cl.deleteFirst();
        cl.Frontprint();
        cl.deleteEnd();
        cl.Frontprint();
    }
}
