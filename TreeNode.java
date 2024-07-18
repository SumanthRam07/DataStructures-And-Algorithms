package trees;

import java.util.*;
public class TreeNode {
	
	
	
	String data ;
	
	ArrayList<TreeNode> children ;

	public TreeNode(String data) {
		super();
		this.data = data;
		this.children = new ArrayList<>() ;
	} 
	
	
	
	public void addChildren(TreeNode child)
	{
		
		this.children.add(child);
		
	}
	
	
	public String print(int level)
	{
		
	
		String ret = " ".repeat(level)+this.data+"\n" ;
		
		for( TreeNode node : this.children)
		{
			
			ret += node.print(node.children.size()+1) ;
		}
		
		
		return ret ; 
		
	}
	
	
	
	

}
