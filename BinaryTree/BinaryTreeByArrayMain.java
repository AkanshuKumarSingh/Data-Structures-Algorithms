package BinaryTree;

public class BinaryTreeByArrayMain {

	public static void main(String[] args) {
		BinaryTreeByArray tree = new BinaryTreeByArray(10);
		for(int i=1;i<=10;i++) {
			tree.insert(i*10);
		}
		System.out.println();
		tree.levelOrder();
		System.out.println();
		tree.preOrder(1);
		System.out.println();
		tree.inOrder(1);
		System.out.println();
		tree.postOrder(1);
		System.out.println();
		tree.levelOrder();
		System.out.println(tree.search(80));
		tree.delete(80);
		tree.levelOrder();
		tree.deleteTree();
//		tree.levelOrder();
		
	}

}
