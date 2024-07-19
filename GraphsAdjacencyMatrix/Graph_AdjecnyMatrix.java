package trees.GraphsAdjacencyMatrix;

import trees.TreeWeightedGraphNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_AdjecnyMatrix {

    ArrayList<TreeWeightedGraphNode>  nodeList = new ArrayList<>() ;
    int[][] adjacencyMatrx ;

    public Graph_AdjecnyMatrix(ArrayList<TreeWeightedGraphNode> nodeList) {
        this.nodeList = nodeList;
        this.adjacencyMatrx = new int[nodeList.size()][nodeList.size()];
    }


    public void insert( int i , int j )
    {

        adjacencyMatrx[i][j] = 1 ;
        adjacencyMatrx[j][i] = 1 ;


    }


    public void printGraph()
    {
        for( int i = 0 ; i < adjacencyMatrx[1] .length ; i++)
        {
            for( int j = 0 ; j < adjacencyMatrx.length ; j++)
            {

                System.out.print(adjacencyMatrx[i][j] + " ");
            }

            System.out.println("\n") ;
        }


    }


    public ArrayList<TreeWeightedGraphNode> getchildren(TreeWeightedGraphNode node)
    {

        ArrayList<TreeWeightedGraphNode> children = new ArrayList<>();
        int nodeIndex = node.index ;

        for( int i = 0 ; i < adjacencyMatrx[nodeIndex].length ; i++)
        {
            if( adjacencyMatrx[nodeIndex][i] == 1)
            {
                children.add( nodeList.get(i)) ;
            }


        }

   return children ;

    }




    public void  BFS(TreeWeightedGraphNode node)
    {

        Queue<TreeWeightedGraphNode> queue = new LinkedList<>() ;


            ArrayList<TreeWeightedGraphNode> children = getchildren(node);


           queue.add( node) ;

           while( ! queue.isEmpty())
           {
               TreeWeightedGraphNode current = queue.remove() ;


               System.out.print(  current.data + "->");

               current.isVisited = true ;

               for( TreeWeightedGraphNode tempNode : children)
               {
                   if( !tempNode.isVisited)
                   {

                       queue.add(tempNode) ;
                      tempNode.isVisited = true ;

                   }
               }



           }


    }



    public void BFSCaller( )
    {
        for( TreeWeightedGraphNode tempNode : nodeList)
        {
           // System.out.println(tempNode.data);
            if( !tempNode.isVisited)
            {
                BFS(tempNode);
            }
        }


    }

}
