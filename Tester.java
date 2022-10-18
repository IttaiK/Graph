public class Tester{

    /*
     Minimum spanning tree:
        find lightests path that touches every nodes
            Do it by: 
                Find the lightest(smallest) edge touching an accessed node (first time just around staring node) and going to a new node
                    Add to binaryHeap of edges
                LOOP THIS: so -> Keep this up (so next time find lightest edge touching either first node or connected node)
                    Add to BinaryHeap of edges
     */


    public static void main(String[] args){

        int tests = 0;
        int testsPassed = 0;

        tests++;
        Graph town = new Graph();
        testsPassed++;

        tests  += 2;
        Node townHall = new Node();
        town.insertNode(townHall);
        testsPassed += 2;

        tests  += 2;
        Node market = new Node();
        town.insertNode(market);
        testsPassed += 2;

        tests += 2;
        Edge MTH = new Edge(market, townHall, 5);
        town.insertEdge(MTH);
        testsPassed += 2;

        tests  += 2;
        Node hospital = new Node();
        town.insertNode(hospital);
        testsPassed += 2;

        tests += 2;
        Edge HTH = new Edge(hospital, townHall, 2);
        town.insertEdge(HTH);
        testsPassed += 2;

        tests += 2;
        Edge MH = new Edge(market, hospital, 7);
        town.insertEdge(MH);
        testsPassed += 2;
    
        System.out.println("Passed " + tests + "/" + testsPassed + " test cases");
    }
}