package trees.treesImpWithArray;

public class MainClass {

	public static void main(String[] args) {
		
		int [] BinaryArray = new int[7] ;
	
	
		BinaryNodeArrayImpl binaryArray = new BinaryNodeArrayImpl( BinaryArray , 0) ; 
		
		binaryArray.Insert(1);
		binaryArray.Insert(2);
		
		binaryArray.Insert(3);
		
		
		binaryArray.Insert(4);
		
		binaryArray.Insert(5);
		binaryArray.Insert(6);

		
		binaryArray.delete(3);
		
		binaryArray.levelOrder();
		
	
//		
//		System.out.println(binaryArray.search(4) );
		
	}

}
