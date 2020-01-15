package stack;

import java.util.Stack;

public class stackByLinkedListMain {

	public static void main(String[] args) {
		
		stackByLinkedList sll = new stackByLinkedList();
		for(int i=1;i<6;i++) {
			sll.push(i*10);
		}
		sll.peek();
		for(int i=0;i<6;i++) {
			sll.pop();
		}
		sll.peek();
		int arr[] = new int[5];
		System.out.println(arr.length);
	}

}
