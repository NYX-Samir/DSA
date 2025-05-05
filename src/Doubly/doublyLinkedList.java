package Doubly;

public class doublyLinkedList {
    Node head;
    Node tail;

    public doublyLinkedList(){
        head=tail=null;
    }

    public void insertAtFirst(int value){
        Node newNode=new Node(value);

        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }

    public void insertAtEnd(int value){
        Node newNode=new Node(value);

        if(head==null) {
            head = newNode;
            tail = newNode;
        }else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }

    }

    public void insertAtPosition(int position,int value){
        Node newNode=new Node(value);

        if(position==0){
            insertAtFirst(value);
            return;}
        if(position<0){
            System.out.println("Invalid Position");
            return;}
        int index=0;
        Node temp=head;
        while(index!=position-1 && temp!=null){
            temp=temp.next;
            index++;
        }
        if(temp==null){
            System.out.println("Invalid Position");
            return;
        }
        newNode.prev=temp;
        newNode.next=temp.next;
        temp.next=newNode;
        temp.next.prev=newNode;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"➡️");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("LinkedList is Empty");
            return;
        }
        if(head.next==null){
            head=tail=null;
            return;
        }
        head=head.next;
        head.prev=null;
    }

    public void deleteEnd(){
        if(head==null){
            System.out.println("LinkedList is Empty");
            return;
        }
        if(tail.prev==null){
            head=tail=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }

    }
    public static class Main{
        public static void main(String[] args) {
            doublyLinkedList dl=new doublyLinkedList();
            dl.insertAtFirst(-10);
            dl.insertAtFirst(-20);
            dl.insertAtFirst(-30);
            dl.insertAtFirst(-40);
            dl.print();
            dl.insertAtEnd(10);
            dl.insertAtEnd(20);
            dl.insertAtEnd(30);
            dl.insertAtEnd(40);
            dl.print();
            dl.insertAtPosition(4,0);
            dl.print();
            dl.deleteFirst();
            dl.deleteEnd();
            dl.print();
        }
    }
}
