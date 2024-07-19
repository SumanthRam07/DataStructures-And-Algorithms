package trees.Graphs_AdjencyList;

import trees.TreeWeightedGraphNode;


import java.util.ArrayList;

public class Graph_Main {


    public static void main(String[] args) {


        ArrayList<TreeWeightedGraphNode> nodeList = new ArrayList<>();

        nodeList.add(new TreeWeightedGraphNode(0,"A")) ;
        nodeList.add(new TreeWeightedGraphNode(1, "B"));
        nodeList.add(new TreeWeightedGraphNode(2, "C"));
        nodeList.add(new TreeWeightedGraphNode(3, "D"));
        nodeList.add(new TreeWeightedGraphNode(4, "E"));


        Graph_AdjecnyList adjecnyList = new Graph_AdjecnyList(nodeList);

        adjecnyList .insert(0, 1);
        adjecnyList .insert(0, 2);

        adjecnyList.insert(0, 3);
        adjecnyList.insert(1, 4);
        adjecnyList.insert(2, 3);
        adjecnyList.insert(3, 4);






        adjecnyList.DFS() ;

    }
}