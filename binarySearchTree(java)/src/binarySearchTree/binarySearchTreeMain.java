package binarySearchTree;

public class binarySearchTreeMain<Tree extends Comparable<Tree>> {
    private Node<Tree> root;
    private int size;

    public binarySearchTreeMain() {
        root = null;
        size = 0;
    }

    public void add(Tree element) {
        if (root == null) {
            root = new Node<>(element); 
            size++;
        } else {
            addMethod(root, element);
        }
    }

    private void addMethod(Node<Tree> node, Tree element) {
        if (element.compareTo(node.data) < 0) {
            if (node.left == null) {
                node.left = new Node<>(element); 
                size++;
            } else {
                addMethod(node.left, element); 
            }
        } else if (element.compareTo(node.data) > 0) {
            if (node.right == null) {
                node.right = new Node<>(element);
                size++;
            } else {
                addMethod(node.right, element); 
            }
        }
    }

    public Node<Tree> find(Tree element) {
        return findMethod(root, element);
    }

    private Node<Tree> findMethod(Node<Tree> node, Tree element) {
        if (node == null || element.compareTo(node.data) == 0) {
            return node; 
        }

        if (element.compareTo(node.data) < 0) {
            return findMethod(node.left, element); 
        } else {
            return findMethod(node.right, element); 
        }
    }

    public void preorder() {
        preorderMethod(root);
        System.out.println();
    }

    private void preorderMethod(Node<Tree> node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderMethod(node.left); 
            preorderMethod(node.right); 
        }
    }

    public void inorder() {
        inorderMethod(root);
        System.out.println();
    }

    private void inorderMethod(Node<Tree> node) {
        if (node != null) {
            inorderMethod(node.left);   
            System.out.print(node.data + " ");
            inorderMethod(node.right);  
        }
    }

    public void postorder() {
        postorderMethod(root);
        System.out.println();
    }

    private void postorderMethod(Node<Tree> node) {
        if (node != null) {
            postorderMethod(node.left); 
            postorderMethod(node.right); 
            System.out.print(node.data + " ");
        }
    }

    public int size() {
        return size;
    }
}
