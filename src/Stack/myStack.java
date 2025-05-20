package Stack;

public class myStack {
    int[] arr;
    int size;
    int index=0;
    public myStack(int size){
        this.size=size;
        this.arr= new int[size];
    }

    public boolean isFull(){
        if(index>=size) {
            System.out.println("Stack is Overflow");
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(index<0){
            System.out.println("Stack is underflow");
            return true;
        }else{
            return false;
        }
    }
    public void push(int data){
        if(isFull()){
            return;
        }
        arr[index]=data;
        index++;
    }

    public void pop(){
        if(isEmpty()){
            return;
        }
        index--;
        System.out.println("Pop element is :"+arr[index]);
    }

    public void display(){
        if(isEmpty()){
            return;
        }
        for(int i=0;i<index;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


}
