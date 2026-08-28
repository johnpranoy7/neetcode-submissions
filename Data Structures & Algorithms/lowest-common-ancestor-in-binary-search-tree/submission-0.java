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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val < q.val)
           return dfs(root,p,q);
        else
           return dfs(root,q,p);
    }

    public TreeNode dfs(TreeNode root, TreeNode p, TreeNode q) {
        if(p==null || q==null || root==null)
            return null;

        if(q.val < root.val){
            //check left tree
            return dfs(root.left,p,q);
        }
        else if(root.val<p.val){
            //check right
            return dfs(root.right,p,q);
        }else
            return root;

    }
}
