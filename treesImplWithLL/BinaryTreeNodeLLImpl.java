package trees.treesImplWithLL;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeNodeLLImpl {

	
	public BinaryNode root ; 
	
	public BinaryTreeNodeLLImpl()
	{
		this.root= null ; 
	}
	
	
	
	public void PreOrder(BinaryNode node)
	{
		
		
		if( node == null)
		{
			return  ; 
			
		}
		
		System.out.println(node.data);
		PreOrder( node.left); 
		PreOrder(node.right) ; 
		
		
		
	}
	
	
	public void InOrder(BinaryNode node)
	{
		
		
		if( node == null)
		{
			return  ; 
			
		}
		InOrder( node.left); 
		
		System.out.println(node.data); 
		InOrder(node.right) ; 
		
		
		
	}
	
	
	public void PostOrder(BinaryNode node)
	{
		
		
		if( node == null)
		{
			return  ; 
			
		}
		PostOrder( node.left); 
		PostOrder(node.right) ; 
		System.out.println(node.data); 
		
		
		
	}
	
	
	
	
	public void levelOrder(BinaryNode root )
	{
		
		Queue<BinaryNode> queue = new LinkedList<>() ; 
		
		queue.add(root); 
		
		while( !queue.isEmpty())
		{
			
			
		   BinaryNode temp = queue.poll(); 
		   
		   System.out.println(temp.data) ; 
		   
		   if( temp.left != null)
		   {
			   queue.add(temp.left);
		   }
		   if( temp.right != null)
		   {
			   queue.add(temp.right);
		   }
			
			
			
			
		}	
		
	}
	
	public  void Insert( Integer data)
	{
		BinaryNode newNode = new BinaryNode(data) ;
		
		Queue<BinaryNode> queue = new LinkedList<>() ;
		
		
		if( root == null)
		{
			root = newNode ;
			
			System.out.println("successfully created a new node") ;
			
					
					
		}
		else
		{
		
	
		queue.add(root); 
		
		while(! queue.isEmpty())
		{
			
			BinaryNode presentNode = queue.poll() ;
		
		 if(presentNode.left == null)
		{
			 presentNode.left = newNode ; 
			System.out.println("Successfullly inserted");
			
			break ;
		}
		
		else if( presentNode.right == null)
		{
			presentNode.right=newNode ; 
			System.out.println("Successfullly inserted");
			break ; 
		}
		else
		{
			queue.add(presentNode.left);
			queue.add(presentNode.right) ;
		}
			
	}
		
		
		}	
		
	
	
	}
	
	
	public BinaryNode findDeepestNode()
	{
		Queue<BinaryNode> queue = new LinkedList<>() ; 
		
		queue.add(root); 
		
		BinaryNode deepestNode = null ;
		
		
		while( !queue.isEmpty())
		{
			 deepestNode = queue.poll(); 
		   
		   
		   if( deepestNode.left != null)
		   {
			   queue.add(deepestNode.left);
		   }
		   if( deepestNode.right != null)
		   {
			   queue.add(deepestNode.right);
		   }
		   
			
	
		}	
		
		
        return deepestNode ;
		
		
	}
	

	public void DeleteDeepestNode()
	{
		
        BinaryNode presentNode = null ; 
        BinaryNode previousNode = null ; 
		
Queue<BinaryNode> queue = new LinkedList<>() ; 
		
		queue.add(root); 
		
		while( !queue.isEmpty())
				
		{
		
		previousNode = presentNode ; 
		presentNode = queue.poll() ;
			
			   
		   if( presentNode.left == null)
		   {
			   previousNode.right =null ; 
			   break ; 
		   }
		   else if( presentNode.right == null)
		   {
			   presentNode.left = null ; 
			   break ; 
		   }
		   else
		   {
			   queue.add(presentNode.left);
			   queue.add(presentNode.right);
			   
		   }
		   
		 
	   	  
	  			
	}
		
		  
		
	}
		
	
	
	public void DeleteNode( int data)
	{
		
		
Queue<BinaryNode> queue = new LinkedList<>() ; 
		
		queue.add(root); 
		
		while( !queue.isEmpty())
				
		{
		
		
		BinaryNode temp = queue.poll() ;
			
			   
		  if(temp.data == data)
		  {
			  temp.data = findDeepestNode().data ;
			  
			  DeleteDeepestNode() ;
			System.out.println("successully delete ") ;
			levelOrder(root);
			  break ; 
			  
		  }
		  if( temp.left != null)
		  {
			  queue.add(temp.left);
			  
			  
		  }
		   if( temp.right != null)
		  {
			  queue.add(temp.right) ;
		  }
		   
		   
		
		
		
		
		
	}
	
 
		
		
	}	
	
	
	
	
	
	
	
	
	
	}
	

