import java.util.ArrayList;

public class Graph {

    public ArrayList<Node> nodes = new ArrayList<>();
    public ArrayList<Edge> edges = new ArrayList<>();

    public Graph(){}
    public void insertNode(Node n){
        nodes.add(n);
    }

    public void insertEdge(Edge e){
        edges.add(e);
    }
}
