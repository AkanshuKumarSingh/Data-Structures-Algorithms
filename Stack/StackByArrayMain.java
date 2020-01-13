package stack;

public class StackByArrayMain {

	public static void main(String[] args) {
		StackByArray stack = new StackByArray(4);
		for(int i=1;i<5;i++) {
			stack.push(i*10);
			}
		stack.peek();
		stack.deleteStack();
		for(int i=1;i<5;i++) {
			stack.pop();
			}
		stack.peek();

	}

}
