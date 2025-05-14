package Tree.binary;

public class Main {
    public static void main(String[] args) {

        Node root = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);

        binaryTree bt=new binaryTree(root);

        bt.root.left=left;
        bt.root.right=right;

        Node node4=new Node(4);
        Node node5=new Node(5);

        bt.root.left.left=node4;
        bt.root.left.right=node5;
        Node node6 =new Node(6);
        bt.root.right.right= node6 ;

        System.out.println("Pre-Order");
        binaryTree.preOrder(bt.root);
        System.out.println();
        System.out.println("In-Order");
        binaryTree.inOrder(bt.root);
        System.out.println();
        System.out.println("Post-Order");
        binaryTree.postOrder(bt.root);
        System.out.println();
    }
}
