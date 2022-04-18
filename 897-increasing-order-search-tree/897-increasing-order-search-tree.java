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
    TreeNode tree;
    public TreeNode increasingBST(TreeNode root) {
        BST(root);
        return tree;
    }
    
    public void BST(TreeNode root) {
        if(root == null)  return;
        BST(root.right);
        tree = new TreeNode(root.val, null, tree);
        BST(root.left);
    }
}