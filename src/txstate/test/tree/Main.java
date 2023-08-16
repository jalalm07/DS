package txstate.test.tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Inorder Traversal:");
        bst.inorderTraversal();

        int searchValue = 40;
        System.out.println("\nSearch for " + searchValue + ": " + bst.search(searchValue));
    }
}