import java.util.*;
class LevelTraversal {
    
   static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;

        }
    }

    class BinaryTree {
        static int idx = -1;

        public static Node BuildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node root = new Node(nodes[idx]);
            root.left = BuildTree(nodes);
            root.right = BuildTree(nodes);

            return root;
        }

    }

    public static void printLevelTraversal(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node a = q.remove();
            if (a == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }
                else {
                    q.add(null);
                }
                
            }
            else {
                System.out.print(a.data + " ");
                if (a.left != null) {
                    q.add(a.left);
                }
                if (a.right != null) {
                    q.add(a.right);
                }
            }
        }
    }

    public static void main(String args[]) {
        int nodes[] = new int[] { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        
        Node root = BinaryTree.BuildTree(nodes);
        printLevelTraversal(root);
  
    }
}
