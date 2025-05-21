package Queue;

public class Main {
    public static void main(String[] args) {
        queue Q = new queue(5);
        Q.Enqueue(10);
        Q.Enqueue(20);
        Q.Enqueue(30);
        Q.Enqueue(40);
        Q.Enqueue(50);
        Q.display();
        Q.Dequeue();
        Q.Dequeue();
        Q.display();

        circularQueue CQ =new circularQueue(5);
        CQ.Enqueue(1);
        CQ.Enqueue(2);
        CQ.Enqueue(3);
        CQ.Enqueue(4);
        CQ.Enqueue(5);
        CQ.display();
        CQ.Dequeue();
        CQ.Dequeue();
        CQ.Dequeue();
        CQ.display();
    }

}
