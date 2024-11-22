
public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graph<String> g = new Graph<String>();
		
		// Add nodes
        g.addNode("A");
        g.addNode("B");
        g.addNode("C");
        g.addNode("D");
        g.addNode("E");

        // Add edges (undirected)
        g.addEdge("A", "B");
        g.addEdge("A", "C");
        g.addEdge("B", "D");
        g.addEdge("C", "E");

        // Run BFS starting from node "A"
        System.out.println("BFS starting from A:");
        g.BreadthFirstSearch("C");
		
	}

}
