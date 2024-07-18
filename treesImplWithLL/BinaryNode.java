package trees.treesImplWithLL;

public class BinaryNode {
	
	
      public int data ; 
      
      public BinaryNode left ; 
     public  BinaryNode right ; 
      
      
      int height ;
      
      
      public BinaryNode(int data) {
    	  this.data=data;
      } ;


	public BinaryNode(int data, BinaryNode left, BinaryNode right, int height) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
		this.height = height;
	}


	
      
      

}
