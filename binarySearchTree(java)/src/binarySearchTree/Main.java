package binarySearchTree;

public class Main {
    public static void main(String[] args) {
        binarySearchTreeMain<Integer> bst = new binarySearchTreeMain<>();

        int[] elements = {10, 5, 15, 9, 7, 64, 77, 67, 54, 3, 11, 34, 23, 2};
        for (int element : elements) {
            bst.add(element);
        }

        System.out.println("Find 77: " + (bst.find(77) != null ? "Found" : "Not Found"));
        System.out.println("Find 1: " + (bst.find(1) != null ? "Not Found" : "Found"));

        System.out.print("Preorder Traversal: ");
        bst.preorder();

        System.out.print("Inorder Traversal: ");
        bst.inorder();

        System.out.print("Postorder Traversal: ");
        bst.postorder();

        System.out.println("Size of BST: " + bst.size());
    }
}
