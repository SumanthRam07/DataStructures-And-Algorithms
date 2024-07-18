package trees.treesImpWithArray;

import trees.treesImplWithLL.BinaryNode;

public class BinaryNodeArrayImpl {
	
	
	int binaryArray[] ; 
	int lastUsedIndex ; 
	
	
	public BinaryNodeArrayImpl( int[]binaryArray ,int lastUsedIndex  )

	{
		this.binaryArray= binaryArray ; 
		this.lastUsedIndex= lastUsedIndex ; 
		
		System.out.println("binary tree as an array of size : " + binaryArray.length + " is created");
		
		
		
		
	}
	
	
	public boolean isFull()
	{
		
		if( lastUsedIndex == binaryArray.length-1)
		{
			return true ; 
		}
		else
		{
			return false ; 
		}
	}
	
	
	
	public void  Insert(int val)
	{
		
		if( ! isFull( ))
		{
			binaryArray[lastUsedIndex+1] = val ; 
			
			lastUsedIndex++ ;
		}
		else
			
		{
			System.out.println(" Binary Tree is full") ;
		}
		
		
	}
	
	
	public void PrerOrdertraversal(int index)
	{
		
		if( index >lastUsedIndex)
		{
			
			return ;
		}
		
		System.out.println(binaryArray[index]) ;
		
		PrerOrdertraversal(2*index) ; 
		PrerOrdertraversal((2*index )+ 1 ) ; 
		
		
	}
	
	

	public void PostOrdertraversal(int index)
	{
		
		if( index >lastUsedIndex)
		{
			
			return ;
		}
		
	
		
		PrerOrdertraversal(2*index) ; 
		PrerOrdertraversal((2*index )+ 1 ) ; 
		
		System.out.println(binaryArray[index]) ;
		
		
	}
	
	

	public void InOrdertraversal(int index)
	{
		
		if( index >lastUsedIndex)
		{
			
			return ;
		}
		
	
		
		PrerOrdertraversal(2*index) ; 
		System.out.println(binaryArray[index]) ;
		PrerOrdertraversal((2*index )+ 1 ) ; 
		
	
		
	}
	
	
	
	public void levelOrder()
	{
		
		for( int i = 0 ; i<=lastUsedIndex  ; i++ )
		{
			System.out.println(binaryArray[i]);
		}
	}
	
	
	public int search( int index)
	{
		
		for( int i = 0 ; i<=lastUsedIndex  ; i++ )
		{
			 if( binaryArray[i] == index )
			 {
				 return  i ; 
			 }
		}
		
		return -1 ; 
		
	}
	
	public void delete(int val)
	{
		int temp = binaryArray[lastUsedIndex] ;
		
		int deleteIndex = search(val) ; 
		
		binaryArray[deleteIndex] = temp ;
		
		lastUsedIndex-- ; 
		
		
		
	}
	
	
	
	
	
}
