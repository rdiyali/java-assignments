import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class Graph<T> 
{

    private Vector<GraphNode<T>> _node;
    private int _count; 

    public Graph()
    {
        _node = new Vector<>();
        _count = 0; 
    }
    
    public void addNode(T element) {
        for (int i = 0; i < _node.size(); i++) {
            GraphNode<T> node = _node.get(i);
            if (node.getData().equals(element)) { 
                return;
            }
        }

        GraphNode<T> newNode = new GraphNode<>(element);
        _node.add(newNode);
        _count++;
    }
    
    public void addEdge(T element1, T element2) {
    	GraphNode<T> node1 = findNode(element1);
        GraphNode<T> node2 = findNode(element2);

        if (node1 != null && node2 != null) {
            node1.addAdjacentNode(node2);
            node2.addAdjacentNode(node1);
        }
    }
    
    public void BreadthFirstSearch(T startElement) {
        GraphNode<T> startNode = findNode(startElement);
        if (startNode == null) {
            System.out.println("Start node not found.");
            return;
        }

        Queue<GraphNode<T>> queue = new LinkedList<>();
        boolean[] visited = new boolean[_node.size()]; 
        queue.add(startNode);
        visited[_node.indexOf(startNode)] = true;  

        while (!queue.isEmpty()) {
            GraphNode<T> currentNode = queue.poll();
            System.out.print(currentNode.getData() + " ");

            for (GraphNode<T> neighbor : currentNode.getAdjacentNodes()) {
                int neighborIndex = _node.indexOf(neighbor);
                if (!visited[neighborIndex]) {
                    visited[neighborIndex] = true;  
                    queue.add(neighbor);
                }
            }
        }
    }
    
    private GraphNode<T> findNode(T element) {
    	for (int i = 0; i < _node.size(); i++) {
        	GraphNode<T> node = _node.get(i);
            if (node.getData().equals(element)) {
                return node;
            }
        }
        return null;
    }
}
