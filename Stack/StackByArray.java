package stack;

public class StackByArray {
	int[] arr;
	int topOfStack;
	
	public StackByArray(int size){
		arr = new int[size];
		topOfStack = -1;
		System.out.println("array stack has been created of size : " + size);
	}
	
	public void push(int value) {
		if(isFullStack()) {
			return;
		}
		arr[++topOfStack] = value;
		System.out.println("value is succesfully inserted...");
	}
	public void pop() {
		if(isEmpty()) {
			return;
		}
		topOfStack--;
		System.out.println("successfully poped : ");
	}
	public boolean isFullStack() {
		if(topOfStack == arr.length-1) {
			return true;
		}
		return false;
	}
	public boolean isEmpty() {
		if(topOfStack == -1) {
			return true;
		}
		return false;
	}
	public void peek() {
		if(isEmpty()) {
			System.out.println("no value exists in the stack......");
			return;
		}
		System.out.println("element is : " + arr[topOfStack]);
	}
	public void deleteStack() {
		arr = null;
		topOfStack = -1;
		System.out.println("stack has been successfully deleted......");
	}
}
