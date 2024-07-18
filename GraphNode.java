package trees;

import java.util.ArrayList;

public class GraphNode {




   public int index;
   public  String data;

  public ArrayList<GraphNode>children ;

   public  boolean isVisited ;

    public GraphNode(int index, String data) {
        this.index = index;
        this.data = data;
        this.isVisited= false ;
        this.children = new ArrayList<>() ;
    }



}

