package Singly;

class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class singlylist {
    Node head=null;

    public void insertBeginning(int item){
        Node newNode = new Node(item);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void insertAtEnd(int item){
        Node newNode=new Node(item);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public void insertAtPosition(int position,int item){
        Node newNode =new Node(item);
        if(position==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        if(position<0){
            System.out.println("Invalid Index");
            return;
        }
        Node temp=head;
        for(int i = 1;i<position;i++){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("position is out of bound!!");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("Null");
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("LinkedList is Empty");
            return;
        }
        head=head.next;
    }

    public void deleteEnd(){
        if(head==null){
            System.out.println("LinkedList is Empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void deletePosition(int position){
        if(position<0){
            System.out.println("Invalid Position");
            return;
        }
        if(position==0){
            deleteFirst();
            return;
        }
        Node temp=head;
        for(int i = 0;i < position-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null || temp.next==null){
            System.out.println("Position is Out of Bound");
        }
        temp.next=temp.next.next ;
    }

}

class Main {
    public static void main(String[] args) {
        singlylist sl = new singlylist();
        sl.insertBeginning(10);
        sl.insertBeginning(20);
        sl.insertBeginning(30);
        sl.insertBeginning(40);
        sl.print();
        sl.insertAtEnd(-10);
        sl.insertAtEnd(-20);
        sl.insertAtEnd(-30);
        sl.insertAtEnd(-40);
        System.out.println();
        sl.print();
        sl.insertAtPosition(4,0);
        System.out.println();
        sl.print();
        sl.deleteFirst();
        sl.deleteEnd();
        sl.deletePosition(3);
        System.out.println();
        sl.print();
    }
}

