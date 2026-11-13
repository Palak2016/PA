

public class Main {
    static class Node {
        long data;
        Node left, right;

        Node(long data) {
            this.data = data;
        }
    }
    static long maxDown(Node root) {
        if (root == null) {
            return 0;
        }
        long left = maxDown(root.left);
        long right = maxDown(root.right);
        return root.data + Math.max(0, Math.max(left, right));
    }
    static String maxPathSum(Node root) {
        if (root == null || root.left == null || root.right == null) {
            return "IMPOSSIBLE";
        }
        long left = maxDown(root.left);
        long right = maxDown(root.right);
        return String.valueOf(root.data + left + right);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(50);
        root.left.right = new Node(60);
        root.right.left = new Node(70);
        root.right.right = new Node(80);

        System.out.println(maxPathSum(root));
    }
}
