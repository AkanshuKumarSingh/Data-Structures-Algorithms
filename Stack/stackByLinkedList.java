package stack;

import LinkedList.linkedList.SingleLinkedList;

public class stackByLinkedList {
	SingleLinkedList list;
	
	public stackByLinkedList() {
		list = new SingleLinkedList();
	}
	
	public void push(int value) {
		if(list.getHead() == null) {
			list.createSingleLinkedList(value);
		}else {
			list.insertLinkedList(value, 0);
		}
		System.out.println("value successfully inserted in stack....");
	}
	
	public void pop() {
		if(isEmpty()) {
			return;
		}
		System.out.println("poping out : " + list.getHead().getValue());
		list.deleteNode(0);
	}
	
	public boolean isEmpty() {
		if(list.getHead() == null) {
			return true;
		}
		else {
			return false;
		}
	}
	public void peek() {
		if(isEmpty()) {
			return;
		}
		System.out.println("element is : " + list.getHead().getValue());
	}
	
	public void deleteStack() {
		list.setHead(null);
	}
}