package trees;

import trees.treesImplWithLL.BinaryNode;
import trees.treesImplWithLL.BinaryTreeNodeLLImpl;

import trees.treesImplWithLL.TraversalTest;

public class MainClass {

	
	
	public static void main(String args[])
	{
		
		TreeNode food = new TreeNode("Indian") ; 
		

		TreeNode southFood = new TreeNode("southFood") ; 
		TreeNode northFood = new TreeNode("northFood") ; 
		

		TreeNode idly = new TreeNode("idly") ;
		

		TreeNode sambar= new TreeNode("sambar") ; 
		

//		food.addChildren(northFood);
//		food.addChildren(southFood);
//		
//		southFood.addChildren(sambar);
//		southFood.addChildren(idly);
		
//		System.out.println(food.print(food.children.size())) ;
		
		
		
		
//		/--------------BinaryNode as linkedlist----------/
		
		
		BinaryNode root = new BinaryNode(0); 
		BinaryNode left = new BinaryNode(1); 
		BinaryNode right = new BinaryNode(2); 
		
		BinaryNode left1 = new BinaryNode(3); 
		BinaryNode right1 = new BinaryNode(4); 
		
		BinaryNode left2 = new BinaryNode(5) ;
		BinaryNode right2 = new BinaryNode(6) ;
		
		root.left = left ;
		root.right= right ;


		left.left = left1 ;
		left.right = left2 ;

		right.left=right1 ;
		right.right=right2;
		
		
		
		BinaryTreeNodeLLImpl binaryTreeNodeLLImpl = new BinaryTreeNodeLLImpl() ;
		
//	 binaryTreeNodeLLImpl.InOrder(root) ;
//	 
//	 System.out.println("           ----------------") ;
//	 
// binaryTreeNodeLLImpl.PostOrder(root) ;
//	 
//	 
//	 System.out.println("           ----------------") ;
//	 binaryTreeNodeLLImpl.PreOrder(root) ;
		
		
		binaryTreeNodeLLImpl.Insert(0);
		binaryTreeNodeLLImpl.Insert(1);
		binaryTreeNodeLLImpl.Insert(2);
		binaryTreeNodeLLImpl.Insert(3);
		binaryTreeNodeLLImpl.Insert(4);


		TraversalTest TraversalTest = new TraversalTest() ;


		System.out.println("is height balaned " +TraversalTest.checkBalanced(root));
		

		
		
		
		
		
//		binaryTreeNodeLLImpl.DeleteNode(2);
	
	


	
		
		
	
		
		
		
		
		
	}
}
