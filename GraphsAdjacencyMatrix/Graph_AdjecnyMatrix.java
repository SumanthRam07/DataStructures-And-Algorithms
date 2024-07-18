package trees.GraphsAdjacencyMatrix;

import trees.GraphNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_AdjecnyMatrix {

    ArrayList<GraphNode>  nodeList = new ArrayList<>() ;
    int[][] adjacencyMatrx ;

    public Graph_AdjecnyMatrix(ArrayList<GraphNode> nodeList) {
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


    public ArrayList<GraphNode> getchildren(GraphNode node)
    {

        ArrayList<GraphNode> children = new ArrayList<>();
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




    public void  BFS(GraphNode node)
    {

        Queue<GraphNode> queue = new LinkedList<>() ;


            ArrayList<GraphNode> children = getchildren(node);


           queue.add( node) ;

           while( ! queue.isEmpty())
           {
               GraphNode current = queue.remove() ;


               System.out.print(  current.data + "->");

               current.isVisited = true ;

               for( GraphNode tempNode : children)
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
        for( GraphNode tempNode : nodeList)
        {
           // System.out.println(tempNode.data);
            if( !tempNode.isVisited)
            {
                BFS(tempNode);
            }
        }


    }

}
