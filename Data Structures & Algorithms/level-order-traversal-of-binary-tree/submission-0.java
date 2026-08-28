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
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> bfsQueue = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();

        if(root==null)
            return res;

        bfsQueue.add(root);
        
        while(bfsQueue.size()>0){
            List<Integer> innerList = new ArrayList<>();
            int levelSize = bfsQueue.size();
            for(int i=0;i<levelSize;i++){
                TreeNode temp = bfsQueue.poll();      
                innerList.add(temp.val);
                if(temp.left!=null)
                    bfsQueue.add(temp.left);
                if(temp.right!=null)
                    bfsQueue.add(temp.right);
            }
            res.add(innerList);
        }
        return res;
    }
}
