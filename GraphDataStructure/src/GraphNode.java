import java.util.Vector;

public class GraphNode<T>
    {
        private T _data;
        private Vector<GraphNode<T>> _adjacentNodes;

        public GraphNode()
        {
            _data = null;
            _adjacentNodes = new Vector<GraphNode<T>>();
        }

        public GraphNode(T data)
        {
            _data = data;
            _adjacentNodes = new Vector<GraphNode<T>>();
        }

        public T getData() {
            return _data;
        }
        
        public void addAdjacentNode(GraphNode<T> node) {
            if (!_adjacentNodes.contains(node)) {
                _adjacentNodes.add(node);
            }
        }

        public Vector<GraphNode<T>> getAdjacentNodes() {
            return _adjacentNodes;
        }

    }
