package Circular;

public class circularLinkedList {
        Node head;
        Node tail;

        public circularLinkedList(){
            this.head=null;
            this.tail=null;
        }

        public void insertAtFirst(int value){
            Node newNode=new Node(value);
            if(head==null){
                head=tail=newNode;
                head.next=head;
                head.prev=head;
            }
            else{
                newNode.next=head;
                newNode.prev=tail;
                head.prev=newNode;
                tail.next=newNode;
                head=newNode;
            }


        }

        public void insertAtEnd(int value){
            Node newNode =new Node(value);
            if(head==null){
                head=tail=newNode;
                head.prev=tail;
                tail.next=head;
            }else{
                newNode.prev=tail;
                newNode.next=head;
                tail.next=newNode;
                head.prev=newNode;
                tail=newNode;
            }
        }

        public void insertAtPosition(int position,int value){
            Node newNode = new Node(value);
                if(position<0){
                    System.out.println("invalid position");
                    return;
                }
                if(position==1){
                    insertAtFirst(value);
                    return;
                }
                Node temp=head;
                int index=0;
                while(index!=position-1 && temp!=null){
                    temp=temp.next;
                    index++;
                }
                if(temp==null){
                    System.out.println("Invalid Position");
                    return;
                }
                newNode.next=temp.next;
                newNode.prev=temp;
                temp.next.prev=newNode;
                temp.next=newNode;
        }

        public void Frontprint(){
            Node temp=head;
            if(tail==null){
                System.out.println("List is empty");
                return;
            }
            do{
                System.out.print(temp.data+"==>");
                temp=temp.next;
            }while (temp!=head);

            System.out.println();
        }

        public void Backprint(){
        Node temp=tail;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        do{
            System.out.print(temp.data+"==>");
            temp=temp.prev;
        }while (temp!=tail);

        System.out.println();
    }

        public void deleteFirst(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            else{
                head.next.prev=head.prev;
                head=head.next;
                tail.next=head;
            }
        }

        public void deleteEnd(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            else{
                tail=tail.prev;
                tail.next=head;
                head.prev=tail;
            }
        }
}