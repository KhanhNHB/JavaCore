import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BTS {

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<Node>();
        Queue<Node> result = new LinkedList<Node>();

        queue.add(root);
        result.add(root);

        while (!queue.isEmpty()) {

            Node current = queue.peek();
            if (current.left != null) {
                queue.add(current.left);
                result.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
                result.add(current.right);
            }

            queue.remove();
        }

        for (Node node : result) {
            System.out.print(node.data + " ");
        }
    }

    public static int max(int maxLeft, int maxRight) {
        return maxLeft > maxRight ? maxLeft : maxRight;
    }

    public static int getHeight(Node root) {
        if (root == null) {
            return -1;
        }

        return 1 + max(getHeight(root.left), getHeight(root.right));
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node current;
            if (data <= root.data) {
                current = insert(root.left, data);
                root.left = current;
            } else {
                current = insert(root.right, data);
                root.right = current;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of nodes: ");
        int T = sc.nextInt();

        Node root = null;

        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }

        levelOrder(root);
        // int height = getHeight(root);
        // System.out.println(height);

        sc.close();
    }
}
