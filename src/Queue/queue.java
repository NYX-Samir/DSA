package Queue;

public class queue {
    int[] arr;
    int rear;
    int front;
    int size;
    public queue(int size){
        this.size=size;
        this.arr=new int[size];
        this.rear=0;
        this.front=0;
    }
    public boolean isFull(){
        return rear==size;
    }
    public boolean isEmpty(){
        return front==rear;
    }
    public void Enqueue(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            arr[rear]=data;
            rear++;
    }
    public void Dequeue(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return;
            }
            front++;
    }
    public void display(){
            if(isEmpty()){
                System.out.println("Queue is empty");
            }
            for(int i=front;i<rear;i++){
                System.out.print(arr[i]+" ");
            }
        System.out.println();
    }
}
