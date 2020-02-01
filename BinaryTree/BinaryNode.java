package BinaryTree;

public class BinaryNode {
	private int value;
	private int height;
	BinaryNode right;
	BinaryNode left;
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public BinaryNode getRight() {
		return right;
	}
	public void setRight(BinaryNode right) {
		this.right = right;
	}
	public BinaryNode getLeft() {
		return left;
	}
	public void setLeft(BinaryNode left) {
		this.left = left;
	}
	@Override
	public String toString() {
		return "BinaryNode [value=" + value + ", height=" + height + ", right=" + right + ", left=" + left + "]";
	}
	
}