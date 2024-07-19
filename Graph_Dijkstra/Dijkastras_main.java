package trees.Graph_Dijkstra;



import java.util.ArrayList;

public class Dijkastras_main {

    public static void main(String[] args) {


        ArrayList<trees.Graph_Dijkstra.WeightedGraphNode> nodeList  = new ArrayList<>() ;



         nodeList.add(  new WeightedGraphNode(0 , "A")) ;
        nodeList.add(  new WeightedGraphNode(1 , "B")) ;
        nodeList.add(  new WeightedGraphNode(2 , "C")) ;
        nodeList.add(  new WeightedGraphNode(3 , "D")) ;
        nodeList.add(  new WeightedGraphNode(4 , "E")) ;
        nodeList.add(  new WeightedGraphNode(5 , "F")) ;
        nodeList.add(  new WeightedGraphNode(6 , "G")) ;
        nodeList.add(  new WeightedGraphNode(7 , "H")) ;

        DijkastrasExecution dijkastrasExecution = new DijkastrasExecution(nodeList) ;

        dijkastrasExecution.addDirectedEdge(0,1,2);
        dijkastrasExecution.addDirectedEdge(0,2,5);
        dijkastrasExecution.addDirectedEdge(1,2,6);
        dijkastrasExecution.addDirectedEdge(1,3,1);
        dijkastrasExecution.addDirectedEdge(1,4,3);
        dijkastrasExecution.addDirectedEdge(2,5,8);
        dijkastrasExecution.addDirectedEdge(2,4,4);
        dijkastrasExecution.addDirectedEdge(4,6,9);
        dijkastrasExecution.addDirectedEdge(5,6,7);

        dijkastrasExecution.Dijkastras(nodeList.get(0));












    }
}
