package Stack;

 class Main {
     public static void main(String[] args) {
         myStack stack = new myStack(5);
        stack.display();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

     }
}
