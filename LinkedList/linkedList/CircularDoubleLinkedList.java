package LinkedList.linkedList;

import LinkedList.node.DoubleNode;

public class CircularDoubleLinkedList {
	private DoubleNode head;
	private DoubleNode tail;
	private int size = 0;
	public DoubleNode getHead() {
		return head;
	}
	public void setHead(DoubleNode head) {
		this.head = head;
	}
	public DoubleNode getTail() {
		return tail;
	}
	public void setTail(DoubleNode tail) {
		this.tail = tail;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	DoubleNode createCDLL(int value) {
		DoubleNode node = new DoubleNode();
		node.setValue(value);
		node.setNext(node);
		node.setPrev(node);
		head = node;
		tail = node;
		size++;
		return head;
	}
	
	void insertInCDLL(int value,int location) {
		DoubleNode node = new DoubleNode();
		if(!existsLinkedList()) {
			return;
		}else {
			if(location == 0) {
				node.setValue(value);
				node.setPrev(tail);
				node.setNext(head);
				tail.setNext(node);
				head.setPrev(node);
				head = node;					
			}else if(location >= size) {
				node.setValue(value);
				tail.setNext(node);
				node.setNext(head);
				head.setPrev(node);
				tail = node;
			}else {
				DoubleNode temp = head;
				for(int i=0;i<location-1;i++) {
					temp = temp.getNext();
				}
				node.setValue(value);
				node.setNext(temp.getNext());
				node.setPrev(temp);
				temp.setNext(node);
				node.getNext().setPrev(node);
			}
			
		}
		size++;
	}
	
	private boolean existsLinkedList() {
		if(head == null)
			return false;
		else
			return true;
	}
	
}

