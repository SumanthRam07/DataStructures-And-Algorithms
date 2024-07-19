package trees.Graph_Dijkstra;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightedGraphNode implements Comparable<WeightedGraphNode>{

    String data ;
    int index;
    ArrayList<WeightedGraphNode > neighbours = new ArrayList<>() ;
    HashMap<WeightedGraphNode , Integer>  weightMap;

    boolean isVisited  ;
    int weight ;

    WeightedGraphNode parent ;

    WeightedGraphNode( Integer index, String data )
    {

        this.data = data ;
        this.index= index;
        this.neighbours =new ArrayList<>() ;
        this.weightMap = new HashMap<>() ;
        this.isVisited= false ;
        this.weight= Integer.MAX_VALUE ;
        this.parent= null ;
    }

    @Override
    public int compareTo(WeightedGraphNode o) {
        return this.weight - o.weight;
    }
}
