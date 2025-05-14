package Tree.binary;

public class binaryTree {
    Node root;
    public binaryTree(Node root){
        this.root=root;
    }
    public binaryTree(){
        this.root=null;
    }

    static public void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    static public void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }

    static public void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }

}
