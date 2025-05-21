package Queue;

public class circularQueue {
        int[] arr;
        int rear;
        int front;
        int size;
        public circularQueue(int size){
            this.size=size;
            this.arr=new int[size];
            this.rear=-1;
            this.front=-1;
        }
        public boolean isFull(){
            return (front==(rear+1)%size);
        }
        public boolean isEmpty(){
            return front==-1;
        }
        public void Enqueue(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            if(isEmpty()){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public void Dequeue(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return;
            }
            if(front==rear){
                front=-1;
                rear=-1;
            }else{
                front=(front+1)%size;
            }
        }
        public void display(){
            if(isEmpty()){
                System.out.println("Circular Queue is Empty");
                return;
            }
            int i=front;
            while(true){
                System.out.print(arr[i]+" ");
                if (i==rear) break;
                i=(i+1)%size;
            }
            System.out.println();
        }
}


