class LevelTraversal {
    
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;

        }
    }

    class BinaryTree {
        static int idx = -1;

        public static  Node BuildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            else {
                Node newNode = new Node(nodes[idx]);
                newNode.left = BuildTree(nodes);
                newNode.right = BuildTree(nodes);
            }
        }
    }

    public static void main(String args[]) {
        int nodes[] = new int[] { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        
       Node root = BinaryTree.BuildTree(nodes);
  
    }
}
