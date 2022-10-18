import java.util.ArrayList;

public class Node {

    public ArrayList<Edge> edges = new ArrayList<>();

    public Node(){}

    public void insertEdge(Edge e){
        edges.add(e);
    }
}
