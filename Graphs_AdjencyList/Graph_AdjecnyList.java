package trees.Graphs_AdjencyList;

import trees.TreeWeightedGraphNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph_AdjecnyList {


    ArrayList<TreeWeightedGraphNode> nodeList = new ArrayList<>();
    ArrayList<TreeWeightedGraphNode> adjency_list;

    public Graph_AdjecnyList(ArrayList<TreeWeightedGraphNode> nodeList) {
        this.nodeList = nodeList;
        this.adjency_list = new ArrayList<>();
    }


    public void insert(int i, int j) {

        TreeWeightedGraphNode temp1 = nodeList.get(i);
        TreeWeightedGraphNode temp2 = nodeList.get(j);

         temp1.children.add(temp2) ;
         temp2.children.add(temp1) ;
    }


    public void print()
    {
        for( int i = 0 ; i < nodeList.size() ; i++)
        {
             TreeWeightedGraphNode temp = nodeList.get(i) ;

             System.out.print( temp.data + ": ") ;

             for( TreeWeightedGraphNode temp1 : temp.children)
             {
                 System.out.print( temp1.data + "->");
             }

            System.out.println("\n");
        }


    }



    public void BFS()
    {

        for( TreeWeightedGraphNode node :  nodeList)
        {
            if( !node.isVisited )
            {

                Queue<TreeWeightedGraphNode> q = new LinkedList<>() ;

                q.add(node) ;

                while (!q.isEmpty())
                {
                    TreeWeightedGraphNode temp = q.remove() ;
                    temp.isVisited=true;

                    System.out.print( temp.data + "->") ;

                    for( TreeWeightedGraphNode temp1 : temp.children)
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
        for( TreeWeightedGraphNode node : nodeList)
        {
            if( ! node.isVisited)
            {

                Stack<TreeWeightedGraphNode> stack = new Stack<>() ;
                stack.add(node) ;

                while(! stack .isEmpty())
                {
                    TreeWeightedGraphNode temp = stack.pop() ;

                    System.out.print( temp.data + "->");

                    temp.isVisited = true;

                    for( TreeWeightedGraphNode child : temp.children)
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


    public void addDirectedEdge( int i , int j)
    {
        TreeWeightedGraphNode temp1 = nodeList.get(i) ;
        TreeWeightedGraphNode temp2 = nodeList.get(j) ;

        temp1.children.add(temp2) ;

    }



    public  void TopologicalSort(TreeWeightedGraphNode node , Stack<TreeWeightedGraphNode> stack)
    {
        System.out.println(node.data);
        for( TreeWeightedGraphNode neighbour : node.children)
        {
            if( !neighbour.isVisited)
            {

                TopologicalSort( neighbour ,stack) ;

            }


        }

        node.isVisited = true ;
        stack.add(node) ;



    }



    public void TopologicalStarterFunction()
    {
        Stack<TreeWeightedGraphNode> stack = new Stack<>();
        for( TreeWeightedGraphNode temp : nodeList)
        {

            if( ! temp.isVisited)
            {
                TopologicalSort(temp,stack);

            }

        }


        while( ! stack.isEmpty())
        {
            System.out.print(stack.pop().data + "->");
        }


    }

    public void printPath(TreeWeightedGraphNode node)
    {
        if( node.parent != null)
        {
           printPath(node.parent);
        }

        System.out.print(node.data + " ");
    }

    public void  SingleSourceShortestPath(TreeWeightedGraphNode node )
    {

        Queue<TreeWeightedGraphNode> queue = new LinkedList<>() ;

        queue.add(node) ;

        while ( ! queue.isEmpty())
        {

            TreeWeightedGraphNode temp = queue.remove() ;

                  System.out.print(temp.data + " :");

                  temp.isVisited = true ;
                  printPath(temp) ;

            System.out.println();




            for(TreeWeightedGraphNode temp1 : temp.children)
            {
                if( !temp1.isVisited)
                {
                    queue.add(temp1) ;
                    temp1.parent= temp ;
                    temp1.isVisited = true ;
                }


            }





        }


    }


    public  void SSSPHelperFunction()
    {
        for( TreeWeightedGraphNode temp : nodeList)
        {
            if( !temp.isVisited)
            {
                SingleSourceShortestPath(temp);
            }
        }
    }














}

