package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeByLinkedList {
	BinaryNode root;
	
	BinaryTreeByLinkedList(){
		this.root = null;
	}
	
	void insert(int value) {
		BinaryNode node = new BinaryNode();
		node.setValue(value);
		if(root == null) {
			root = node;
			System.out.println("Successfully inserted at the root!!!");
			return;
		}
		
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			if(presentNode.getLeft() == null) {
				presentNode.setLeft(node);
				System.out.println("Successfully inserted the new node...");
				break;
			}else if(presentNode.getRight() == null) {
				presentNode.setRight(node);
				System.out.println("Successfully inserted the new node...");
				break;
			}else {
				queue.add(presentNode.getLeft());
				queue.add(presentNode.getRight());
			}
		}
	}
	
	void search(int value) {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			if(presentNode.getValue() == value) {
				System.out.println("value found!!!");
				return;
			}else {
				if(presentNode.getLeft() != null) {
				queue.add(presentNode.getLeft());
				}
				if(presentNode.getRight() != null) {
				queue.add(presentNode.getRight());
				}
			}
		}
		System.out.println("value not found in queue!!!");
	}
	
	BinaryNode getDeepestNode() {
		Queue<BinaryNode> queue = new LinkedList<>();
		BinaryNode presentNode=null;
		queue.add(root);
		while(!queue.isEmpty()) {
			presentNode = queue.remove();
			if(presentNode.getLeft() != null) {
				queue.add(presentNode.getLeft());
			}
			if(presentNode.getRight() != null) {
				queue.add(presentNode.getRight());
			}
		}
		return presentNode;
	}
	
	void deleteDeepestNode() {
		
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode previousNode, presentNode = null;
		while (!queue.isEmpty()) {
			previousNode = presentNode;
			presentNode = queue.remove();
			if (presentNode.getLeft() == null) {
				previousNode.setRight(null);
				return;
			}else if ((presentNode.getRight() == null)) {
				presentNode.setLeft(null);
				return;
			}
			queue.add(presentNode.getLeft());
			queue.add(presentNode.getRight());
		}//end of while loop
		
	}

	void deleteNodeOfBinaryTree(int value) {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			System.out.println(presentNode.getValue() + " : " + value);
			if(presentNode.getValue() == value) {
				presentNode.setValue(getDeepestNode().getValue());
				deleteDeepestNode();
				System.out.println("Node has been deleted!!!");
				return;
			}else {
				if(presentNode.getLeft() != null) {
					queue.add(presentNode.getLeft());
				}
				if(presentNode.getRight() != null) {
					queue.add(presentNode.getRight());
				}
			}
		}
		System.out.println("didnot find the element!!!");
		
	}
	
	void preOrder(BinaryNode node) {
		if(node == null)
			return;
		System.out.println(node.getValue() + " ");
		preOrder(node.getLeft());
		preOrder(node.getRight());
	}
	
	void postOrder(BinaryNode node) {
		if(node == null)
			return;
		postOrder(node.getLeft());
		postOrder(node.getRight());
		System.out.println(node.getValue() + " ");
	}
	
	void inOrder(BinaryNode node) {
		if(node == null)
			return;
		inOrder(node.getLeft());
		System.out.println(node.getValue() + " ");
		inOrder(node.getRight());
	}
	
	void levelOrder() {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			System.out.println(presentNode.getValue() + " ");
			if(presentNode.getLeft() != null) {
				queue.add(presentNode.getLeft());
			}
			if(presentNode.getRight() != null) {
				queue.add(presentNode.getRight());
			}
		}
	}

	void deleteTree() {
		root = null;
		System.out.println("Tree has been deleted!!!");
	}
}

