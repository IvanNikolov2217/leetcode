import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInABST {

    private static int count;
    private static int value;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        kthSmallestHelper(root);
        return value;
    }

    public void kthSmallestHelper(TreeNode root)
    {
        if(root == null) return;
        kthSmallestHelper(root.left);
        count--;
        if(count == 0) {
            value = root.val;
            return;
        }
        kthSmallestHelper(root.right);
    }

      public class TreeNode {
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
