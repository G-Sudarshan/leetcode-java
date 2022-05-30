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
    class DiaPair{
        int diameter=0;
        int height=-1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return solve(root).diameter;
    }
    
    public DiaPair solve(TreeNode root){
        if(root == null){
            return new DiaPair();
        }
        DiaPair ldp = solve(root.left);
        DiaPair rdp = solve(root.right);
        DiaPair sdp = new DiaPair();
        
        sdp.height = Math.max(ldp.height, rdp.height) + 1;
        int current_diameter = ldp.height + rdp.height + 2;
        sdp.diameter = Math.max(current_diameter, Math.max(ldp.diameter, rdp.diameter));
        
        return sdp;
    }
}