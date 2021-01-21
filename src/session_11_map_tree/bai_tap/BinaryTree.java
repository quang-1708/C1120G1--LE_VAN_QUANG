package session_11_map_tree.bai_tap;

public class BinaryTree {
    private static Node root;

    public BinaryTree(int data)
    {
        root = new Node(data);
    }

    public void add(Node parent, Node child, String orientation)
    {
        if (orientation.equals("left"))
        {
            parent.setLeft(child);
        }
        else
        {
            parent.setRight(child);
        }
    }

    public static void main(String args[])
    {
        Node n1 = new Node(1);
        Node n2 = new Node(4);
        Node n3 = new Node(2);
        Node n4 = new Node(5);

        BinaryTree tree = new BinaryTree(3);
        tree.add(root, n1, "left");
        tree.add(root, n2, "right");
        tree.add(n2, n3, "left");
        tree.add(n2, n4, "right");
    }
}
