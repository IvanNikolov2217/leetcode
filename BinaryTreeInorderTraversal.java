import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversalHelper(root, list);
        return list;
    }

    public List<Integer> inorderTraversalHelper(TreeNode tree, List<Integer> list)
    {
        if(tree == null) return list;
        inorderTraversalHelper(tree.left, list);
        list.add(tree.val);
        inorderTraversalHelper(tree.right, list);

        return list;
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
