package ds.tree;

public class Tree {
    private class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
    }

    private TreeNode root;

    public Tree(){
        root = null;
    }

    public void inorder(){
        inOrderTraversal(root);
    }

    private void inOrderTraversal(TreeNode root) {
        if(root == null) return;
        inOrderTraversal(root.left);
        System.out.println(root.value);
        inOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        Tree tree = new Tree();

    }
}
