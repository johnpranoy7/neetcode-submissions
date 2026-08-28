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
    public int maxD = 0;
    public int maxDepth(TreeNode root) {
        return dfs(root,0);
    }

    public int dfs(TreeNode node, int height){

        if(node==null){
            return height;
        }
        
        int left = dfs(node.left, height+1);
        int right = dfs(node.right, height+1);


        return Math.max(left, right); 
    }
}
