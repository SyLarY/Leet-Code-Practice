/*
Given a binary tree, return the level order traversal of its nodes' values. 
(ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
 */

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
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        levelHelper(result, root, 0);
        return result;
        
    }
    
    public void levelHelper(List<List<Integer>> result, TreeNode root, int height){
        if(root == null)
            return;
        
        if(height >= result.size()){
            result.add(new ArrayList<Integer>());
        }
        
        result.get(height).add(root.val);
        
        levelHelper(result, root.left, height+1);
        levelHelper(result, root.right, height+1);
    }
}