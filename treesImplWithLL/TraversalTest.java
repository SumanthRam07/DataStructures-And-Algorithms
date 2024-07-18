package trees.treesImplWithLL;

import trees.TreeNode;

public class TraversalTest {

    int leftHeight = 0 ;
    int rightHeight = 0 ;

    public int checkBalanced( BinaryNode root)
    {

        if( root == null)
        {
            return 1 ;
        }

        leftHeight = leftHeight + checkBalanced(root.left) ;
        rightHeight = rightHeight + checkBalanced(root.right) ;

        if( Math.abs(leftHeight-rightHeight) > 1)
        {

            return -1 ;
        }
        else
        {
            return 1 ;
        }







    }


}
