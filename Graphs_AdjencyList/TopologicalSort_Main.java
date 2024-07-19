package trees.Graphs_AdjencyList;

import trees.TreeWeightedGraphNode;

import java.util.ArrayList;

public class TopologicalSort_Main {

    public static void main(String[] args) {

        ArrayList<TreeWeightedGraphNode> nodeList = new ArrayList<>() ;

        nodeList.add(new TreeWeightedGraphNode(0, "A"));
        nodeList.add(new TreeWeightedGraphNode(1, "B"));
        nodeList.add(new TreeWeightedGraphNode(2, "C"));
        nodeList.add(new TreeWeightedGraphNode(3, "D"));
        nodeList.add(new TreeWeightedGraphNode(4, "E"));
        nodeList.add(new TreeWeightedGraphNode(5, "F"));
        nodeList.add(new TreeWeightedGraphNode(6, "G"));
        nodeList.add(new TreeWeightedGraphNode(7, "H"));



        Graph_AdjecnyList adjecnyList = new Graph_AdjecnyList(nodeList) ;

        adjecnyList.addDirectedEdge(0,1);
        adjecnyList.addDirectedEdge(0,2);
        adjecnyList.addDirectedEdge(1,3);
        adjecnyList.addDirectedEdge(1,6);
        adjecnyList.addDirectedEdge(2,3);
        adjecnyList.addDirectedEdge(2,4);
        adjecnyList.addDirectedEdge(3,5);
        adjecnyList.addDirectedEdge(4,5);
        adjecnyList.addDirectedEdge(5,6);

       // adjecnyList.TopologicalStarterFunction();

        adjecnyList.SSSPHelperFunction() ;







    }
}
