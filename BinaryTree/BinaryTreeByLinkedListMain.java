package BinaryTree;

public class BinaryTreeByLinkedListMain {

	public static void main(String[] args) {
		BinaryTreeByLinkedList tree = new BinaryTreeByLinkedList();

		for (int i = 1; i < 11; i++) {
			tree.insert(i * 10);
		}


		
		  System.out.println("Level order traversal..."); tree.levelOrder();
		  
		  System.out.println(); tree.deleteNodeOfBinaryTree(30); tree.levelOrder();
		  System.out.println(); tree.preOrder(tree.root); System.out.println();
		  tree.postOrder(tree.root); System.out.println(tree.getDeepestNode());
		  tree.deleteTree();
	}
}
