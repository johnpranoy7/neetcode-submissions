/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null)
            return false;
        
        boolean result = false;
        
        if(root.val == subRoot.val){
            result = dfsCheck(root, subRoot);
            if(result)
                return true;
        }
        
        boolean left = isSubtree(root.left, subRoot);
        boolean right = isSubtree(root.right, subRoot);
        
        return left || right;
    }

    public boolean dfsCheck(TreeNode a, TreeNode b){
        if(a==null && b==null)
            return true;
        else if( (a==null && b!=null) || (a!=null && b==null) )
            return false;
        
        boolean leftMatch = false, rightMatch = false;

        if( (a!=null && b!=null) && a.val==b.val){
            leftMatch = dfsCheck(a.left, b.left);
            rightMatch = dfsCheck(a.right, b.right); 
        }
  
        return leftMatch && rightMatch;

    }

}
