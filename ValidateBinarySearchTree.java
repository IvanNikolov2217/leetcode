
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE );
    }

    public boolean isValidBSTHelper(TreeNode root, long min, long max)
    {
        if(root == null) return true;
        long value = root.val;
        if(value < min || value > max) return false;
        return isValidBSTHelper(root.left, min, value - 1 ) && isValidBSTHelper(root.right,value + 1, max);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
