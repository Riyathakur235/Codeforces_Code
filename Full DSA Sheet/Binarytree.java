
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}
    public class Binarytree {
            Node root;

            public Binarytree() {
                root = null;
            }

            void inordertraversal(Node node) {
                if (node == null) return;
                inordertraversal(node.left);
                System.out.println(node.data + "");
                inordertraversal(node.right);
                System.out.println(node.data);
            }

            void preorder(Node node) {
                if (node == null) return;
                System.out.println(node.data + "");
                preorder(node.left);
                preorder(node.right);

            }

            void postorder(Node node) {
                if (node == null) return;
                postorder(node.left);
                postorder(node.right);
                System.out.println(node.data + "");
            }

            public static void main(int[] args) {
                Binarytree tree = new Binarytree();
                tree.root = new Node(1);
                tree.root.left = new Node(2);
                tree.root.right = new Node(3);
                tree.root.left.left = new Node(4);
                tree.root.right.right = new Node(5);
                tree.inordertraversal(tree.root);
                System.out.println();
                tree.preorder(tree.root);
                System.out.println();
                tree.postorder(tree.root);
            }
        }


