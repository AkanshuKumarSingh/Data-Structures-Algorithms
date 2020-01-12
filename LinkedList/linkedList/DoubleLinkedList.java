package LinkedList.linkedList;

import LinkedList.node.DoubleNode;

public class DoubleLinkedList {
	DoubleNode head;
	DoubleNode tail;
	int size =0;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	DoubleNode createDoubleLinkedList(int value) {
		DoubleNode node = new DoubleNode();
		node.setValue(value);
		node.setNext(null);
		node.setPrev(null);
		head = node;
		tail = node;
		size++;
		return head;
	}
	
	void insertDLL(int value,int location) {
		DoubleNode node = new DoubleNode();
		node.setValue(value);
		if(!exitsLinkedList()) {
			System.out.println("linked List does not exists");
			return;
		}else if(location == 0) {
			node.setPrev(null);
			node.setNext(head);
			head.setPrev(node);
			head = node;
		}else if(location >= size) {
			node.setPrev(tail);
			node.setNext(null);
			tail.setNext(node);
			tail = node;
		}else {
			DoubleNode temp = head;
			for(int i=0;i<location-1;i++) {
				temp = temp.getNext();
			}
			temp.getNext().setPrev(node);
			node.setNext(temp.getNext());
			temp.setNext(node);
			node.setPrev(temp);			
		}
		size++;
	}
	
	void traverseLinkedList() {
		DoubleNode temp = head;
		if(!exitsLinkedList()) {
			return;
		}else {
			for(int i=0;i<size;i++) {
				System.out.print(temp.getValue());
				if(i != size-1)
				System.out.print("<->");
				temp = temp.getNext();
			}
		}
		System.out.println();
	}
	
	void traverseLLInReverse() {
		DoubleNode temp = tail;
		if(!exitsLinkedList()) {
			return;
		}else {
			for(int i=0;i<size;i++) {
				System.out.print(temp.getValue());
				if(i != size-1)
				System.out.print("<->");
				temp = temp.getPrev();
			}	
		}
	}
	
	void searchNode(int value) {
		if(!exitsLinkedList()) {
			return;
		}else {
			DoubleNode temp = head;
			for(int i=0;i<size;i++) {
				if(value == temp.getValue()) {
					System.out.println("value found!!!");
					return;
				}
				temp = temp.getNext();
			}
		}
		System.out.println("not found!!!");
	}
	void deletionOfNode(int location) {
		if(!exitsLinkedList()) {
			return;
		}else {
			if(location == 0) {
				if(size == 1) {
					head = null;
					tail = null;
				}else {
				head.getNext().setPrev(null);
				head = head.getNext();
				}
			}else if(location >= size) {
				if(size == 1) {
					head = null;
					tail = null;
				}else {
				tail = tail.getPrev();
				tail.setNext(null);
				}
			}else {
				DoubleNode temp = head;
				for(int i=0;i<location-1;i++) {
					temp = temp.getNext();
				}
				temp.setNext(temp.getNext().getNext());
				temp.getNext().setPrev(temp);
			}			
		}
	size--;
	}
	void deleteDLL() {
		DoubleNode temp = head;
		if(!exitsLinkedList()) {
			return;
		}else {
			System.out.println("link list has been deleted...");
			for(int i=0;i<size;i++) {
				temp.setPrev(null);
				temp = temp.getNext();
			}
			head = null;
			tail = null;
		}
	}
	
	private boolean exitsLinkedList() {
		if(head != null)
		return true;
		else 
		return false;
	}
	
}
