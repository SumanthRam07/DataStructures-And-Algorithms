package trees.GraphsAdjacencyMatrix;

import trees.TreeWeightedGraphNode;

import java.util.ArrayList;

public class GraphMain {


    public static  void main(String args[]) {


        ArrayList<TreeWeightedGraphNode> nodeList = new ArrayList<TreeWeightedGraphNode>();

        nodeList.add(new TreeWeightedGraphNode(0, "A"));
        nodeList.add(new TreeWeightedGraphNode(1, "B"));
        nodeList.add(new TreeWeightedGraphNode(2, "C"));
        nodeList.add(new TreeWeightedGraphNode(3, "D"));
        nodeList.add(new TreeWeightedGraphNode(4, "E"));





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
