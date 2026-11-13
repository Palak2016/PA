public class TreeMaxPathSum {
    static class Node {
        long val;
        Node left, right;
        Node(long val) {
            this.val = val;
        }
    }
    static long maxPathSum(Node root) {
        if (root == null || root.left == null || root.right == null) {
            return Long.MIN_VALUE;
        }
        long left = maxDown(root.left);
        long right = maxDown(root.right);
        return root.val + left + right;
    }
    static long maxDown(Node node) {
        if (node == null) {
            return 0;
        }
        long left = maxDown(node.left);
        long right = maxDown(node.right);
        return node.val + Math.max(0, Math.max(left, right));
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        if (root.left == null || root.right == null) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(maxPathSum(root));
        }
    }
}