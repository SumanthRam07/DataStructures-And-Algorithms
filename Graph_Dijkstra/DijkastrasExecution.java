package trees.Graph_Dijkstra;



import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkastrasExecution {

    ArrayList<WeightedGraphNode> nodeList = new ArrayList<>() ;

    public DijkastrasExecution(ArrayList<WeightedGraphNode> nodeList)
    {
        this.nodeList= nodeList ;
    }


    public void addDirectedEdge( int i , int j, int d)
    {
        WeightedGraphNode temp1 = nodeList.get(i) ;
        WeightedGraphNode temp2 = nodeList.get(j) ;

        temp1.neighbours.add(temp2) ;
        temp1.weightMap.put(temp2, d) ;

    }

    public void pathPrint( WeightedGraphNode node)
    {
        if( node.parent != null)
        {
            pathPrint( node.parent);
        }

        System.out.print(node.data);

    }


    public void Dijkastras( WeightedGraphNode node)
    {

        PriorityQueue<WeightedGraphNode> pq = new PriorityQueue<>() ;
        node.weight=0 ;
        pq.addAll(nodeList) ;

        while( ! pq.isEmpty())
        {
            WeightedGraphNode temp = pq.remove() ;

            for( WeightedGraphNode neighbour : temp.neighbours)
            {
                if( pq.contains(neighbour))
                {
                    if( neighbour.weight > temp.weight + temp.weightMap.get(neighbour))
                    {
                        neighbour.weight = temp.weight + temp.weightMap.get(neighbour) ;
                    }

                    neighbour.parent = temp ;
                    neighbour.isVisited= true ;
                    pq.remove(neighbour) ;
                    pq.add(neighbour) ;
                }



            }




        }


        for( WeightedGraphNode temp1 : nodeList)
        {
            System.out.print("The shortest path from "+ temp1.data + " weight " + temp1.weight + " :") ;
            pathPrint(temp1);

            System.out.println("\n");
        }


    }








}
