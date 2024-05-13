package data_structure.tree;

class Node{
    int value;
    Node left, right;

    Node(int value){
        this.value = value;
        left = right = null;
    }
    Node getNewNode(int value){
         return new Node(value);
    }
}

public class BinarySearchTree {
    Node root;

    Node insertNewNode(Node root, int value){
        if(root == null){
            root = new Node(value);
        }

        else if (value > root.value) {
            root.right = insertNewNode(root.right, value);
        }

        else if (value < root.value) {
            root.left = insertNewNode(root.left, value);
        }

        return root;
    }

    void preOrder(Node root){
        if(root == null) return;

        System.out.println(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }
}

class Main{
    public static void main(String[] args) {

        Node root = null;

        BinarySearchTree tree = new BinarySearchTree();

        root = tree.insertNewNode(root, 1);
        root = tree.insertNewNode(root, 2);

        tree.preOrder(root);
    }
}
