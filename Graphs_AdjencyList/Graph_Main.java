package trees.Graphs_AdjencyList;

import trees.GraphNode;


import java.util.ArrayList;

public class Graph_Main {


    public static void main(String[] args) {


        ArrayList<GraphNode> nodeList = new ArrayList<>();

        nodeList.add(new GraphNode(0,"A")) ;
        nodeList.add(new GraphNode(1, "B"));
        nodeList.add(new GraphNode(2, "C"));
        nodeList.add(new GraphNode(3, "D"));
        nodeList.add(new GraphNode(4, "E"));


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