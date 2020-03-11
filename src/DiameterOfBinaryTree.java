public class DiameterOfBinaryTree {
    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        return traversalTree(root, 0) - 1;
    }

    public static int traversalTree(TreeNode node, int maxLen) {
        if (node.left == null && node.right == null) {
            node.val = 1;
            maxLen = Math.max(maxLen, node.val);
            return maxLen;
        }
        int leftVal = 0;
        int rightVal = 0;
        if (node.left != null) {
            maxLen = traversalTree(node.left, maxLen);
            leftVal = node.left.val;
        };
        if (node.right != null) {
            maxLen = traversalTree(node.right, maxLen);
            rightVal = node.right.val;
        }
        node.val = Math.max(leftVal + 1, rightVal + 1);
        maxLen = Math.max(maxLen, leftVal + rightVal + 1);
        return maxLen;
    }
}

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }