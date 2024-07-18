package trees.Graphs_AdjencyList;

import trees.GraphNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph_AdjecnyList {


    ArrayList<GraphNode> nodeList = new ArrayList<>();
    ArrayList<GraphNode> adjency_list;

    public Graph_AdjecnyList(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
        this.adjency_list = new ArrayList<>();
    }


    public void insert(int i, int j) {

        GraphNode temp1 = nodeList.get(i);
        GraphNode temp2 = nodeList.get(j);

         temp1.children.add(temp2) ;
         temp2.children.add(temp1) ;
    }


    public void print()
    {
        for( int i = 0 ; i < nodeList.size() ; i++)
        {
             GraphNode temp = nodeList.get(i) ;

             System.out.print( temp.data + ": ") ;

             for( GraphNode temp1 : temp.children)
             {
                 System.out.print( temp1.data + "->");
             }

            System.out.println("\n");
        }


    }



    public void BFS()
    {

        for( GraphNode  node :  nodeList)
        {
            if( !node.isVisited )
            {

                Queue<GraphNode> q = new LinkedList<>() ;

                q.add(node) ;

                while (!q.isEmpty())
                {
                    GraphNode temp = q.remove() ;
                    temp.isVisited=true;

                    System.out.print( temp.data + "->") ;

                    for( GraphNode temp1 : temp.children)
                    {
                        if( ! temp1.isVisited)  q.add(temp1) ;
                        temp1.isVisited=true ;

                    }



                }










            }
        }



    }


    public void DFS( )
    {
        for( GraphNode node : nodeList)
        {
            if( ! node.isVisited)
            {

                Stack<GraphNode> stack = new Stack<>() ;
                stack.add(node) ;

                while(! stack .isEmpty())
                {
                    GraphNode temp = stack.pop() ;

                    System.out.print( temp.data + "->");

                    temp.isVisited = true;

                    for( GraphNode child : temp.children)
                    {

                        if( ! child.isVisited)
                        {
                            stack.add(child) ;
                            child.isVisited = true ;
                        }

                    }



                }










            }







        }






    }












}

