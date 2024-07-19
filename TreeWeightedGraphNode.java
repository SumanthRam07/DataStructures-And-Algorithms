package trees;

import java.util.ArrayList;

public class TreeWeightedGraphNode {




   public int index;
   public  String data;

  public ArrayList<TreeWeightedGraphNode>children ;

   public  boolean isVisited ;

  public TreeWeightedGraphNode parent ;

    public TreeWeightedGraphNode(int index, String data) {
        this.index = index;
        this.data = data;
        this.isVisited= false ;
        this.children = new ArrayList<>() ;
        this.parent= null ;
    }



}

