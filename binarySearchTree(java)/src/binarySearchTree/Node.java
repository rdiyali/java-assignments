package binarySearchTree;

public class Node<Tree extends Comparable<Tree>> {
	
	Tree data;
    Node<Tree> left, right;

    public Node(Tree data) {
        this.data = data;
        left = right = null; 
    }
}

