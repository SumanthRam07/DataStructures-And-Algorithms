package trees.GraphsAdjacencyMatrix;

import trees.GraphNode;

import java.util.ArrayList;

public class GraphMain {


    public static  void main(String args[]) {


        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

        nodeList.add(new GraphNode(0, "A"));
        nodeList.add(new GraphNode(1, "B"));
        nodeList.add(new GraphNode(2, "C"));
        nodeList.add(new GraphNode(3, "D"));
        nodeList.add(new GraphNode(4, "E"));





        Graph_AdjecnyMatrix graphAdjecnyMatrix = new Graph_AdjecnyMatrix(nodeList) ;

        graphAdjecnyMatrix.insert(0,1);
        graphAdjecnyMatrix.insert(0,2);
        graphAdjecnyMatrix.insert(0,3);
        graphAdjecnyMatrix.insert(1,4);
        graphAdjecnyMatrix.insert(2,3);
        graphAdjecnyMatrix.insert(3,4);


        graphAdjecnyMatrix.printGraph();

        graphAdjecnyMatrix.BFSCaller();


    }

}
