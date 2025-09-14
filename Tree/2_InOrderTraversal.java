

class InOrderTraversal {
    
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static class BinaryTree {

        static int idx = -1;

        public Node BuildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }
    }

    public static void preorderTraverse(Node root) {
        
        if (root == null) {
            // System.out.print(-1 + " ");
            return ;
        }
        preorderTraverse(root.left);
        System.out.print(root.data + " ");
        preorderTraverse(root.right);
    }
    
    public static void main(String args[]) {
        int nodes[] = new int[] { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        // System.out.println(root.data);
        preorderTraverse(root);
    }
}

