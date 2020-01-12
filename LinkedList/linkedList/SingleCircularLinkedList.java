package LinkedList.linkedList;

import LinkedList.node.SingleNode;

public class SingleCircularLinkedList {
	
	private SingleNode head;
	private SingleNode tail;
	private int size = 0;
	public SingleNode getHead() {
		return head;
	}
	public void setHead(SingleNode head) {
		this.head = head;
	}
	public SingleNode getTail() {
		return tail;
	}
	public void setTail(SingleNode tail) {
		this.tail = tail;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	SingleNode createLinkedList(int nodeValue) {
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		node.setNext(node);
		head = node;
		tail = node;
		size++;
		return head;
	}
	
	void insertLinkedList(int nodeValue,int location) {
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		if(!existsLinkedList()) {
			return;
		}else {
			if(location == 0) {
				node.setNext(head);
				head= node;
				tail.setNext(node);
			}else if(location >= size) {
				node.setNext(head);
				tail.setNext(node);
				tail = node;
			}
			else {
				SingleNode temp = head;
				for(int i=0;i<location-1;i++) {
					temp = temp.getNext();
				}
				node.setNext(temp.getNext());
				temp.setNext(node);
			}	
		}
		size++;
	}
	
	private boolean existsLinkedList() {
		if(head != null)
		return true;
		else
		return false;
	}
	
	void traverseLinkedList() {
		if(head == null) {
			System.out.println("exit.........");
			return;
		}
		SingleNode temp = head;
		System.out.println();
		for(int i=0;i<size;i++) {
			System.out.print(temp.getValue());
			if(i != size-1)
			System.out.print(" -> ");
			temp = temp.getNext();
		}
	}
	void printHeadUsingTail() {
		if(existsLinkedList()) {
			System.out.println("printing using head : " + head.getValue());
			System.out.println("printing using tail : " + tail.getValue());
			System.out.println("printing head using tail : " + tail.getNext().getValue());
		}
		else {
			return;
		}
	}
	
	void deleteLinkedList(int location) {
		SingleNode temp = head;
		if(!existsLinkedList()) {
			return;
		}else {
			if(location == 0) {
				if(size == 1) {
					head.setNext(null);
					head = null;
					tail = null;
				}else {
				head = head.getNext();
				tail.setNext(head);
				}
			}else if(location >=size) {
				
				for(int i=0;i<size-2;i++) {
					temp = temp.getNext();
				}
				temp.setNext(head);
				tail.setNext(null);
				tail = temp;
			}
			else {
				temp = head;
				for(int i=0;i<location-1;i++) {
					temp = temp.getNext();
				}
				temp.setNext(temp.getNext().getNext());
			}
			
		}
	size--;
	}
	
	boolean searchNode(int value) {
		SingleNode temp = head;
		for(int i=0;i<size-1;i++) {
			if(value == temp.getValue()) {
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}
	
	void deleteLL() {
		if(head==null) {
			return;
		}
		tail.setNext(null);
		head = null;
		tail = null;
	}
	
}
