package BinaryTree;

public class BinaryTreeByArray {
	int arr[];
	int lastUsedIndex;
	
	public BinaryTreeByArray(int size) {
		arr = new int[size+1];
		lastUsedIndex = 0;
		System.out.println("Array has been created!!!");
	}
	
	public boolean isTreeFull() {
		if(lastUsedIndex == arr.length-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public void insert(int value) {
		if(!isTreeFull()) {
			arr[lastUsedIndex + 1] = value;
			lastUsedIndex++;
			System.out.println("Successfully inserted !!!");
		}else {
			System.out.println("array is full!!!");
		}
	}
	
	void levelOrder() {
		for(int i=1;i<=lastUsedIndex;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void preOrder(int index) {
		if(index>lastUsedIndex)
			return;
		System.out.println(arr[index]);
		preOrder(index*2);
		preOrder(index*2 + 1);
	}
	
	public void postOrder(int index) {
		if(index>lastUsedIndex)
			return;
		postOrder(index*2);
		postOrder(index*2 +1);
		System.out.println(arr[index]);
	}
	
	public void inOrder(int index) {
		if(index > lastUsedIndex)
			return;
		inOrder(index*2);
		System.out.println(arr[index]);
		inOrder(index*2 + 1);
	}
	
	public int search(int value) {
		for(int i=1;i<=lastUsedIndex;i++) {
			if(arr[i] == value) {
				System.out.println(value + ": exists in the tree");
				return i;
			}
		}
		System.out.println("value doesnot exits in the tree!!!");
		return -1;
	}
	
	public void delete(int value) {
		int location = search(value);
		if(location == -1) {
			System.out.println("value is not present in the tree!!!");
			return;
		}
		arr[location] = arr[lastUsedIndex];
		lastUsedIndex--;
		System.out.println("Successfully deleted : " + value);
	}
	
	public void deleteTree() {
		arr = null;
		System.out.println("tree has been deleted!!!");
	}
	
}
