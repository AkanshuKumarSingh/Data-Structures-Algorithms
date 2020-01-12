package LinkedList.linkedList;

import java.util.*;

public class QueueByLinkedList {
	SingleLinkedList list;
	
	public QueueByLinkedList() {
		list = new SingleLinkedList();
	}
	
	public void enQueue(int value) {
		if(list.getHead() == null) {
			list.createSingleLinkedList(value);
		}else {
			list.insertLinkedList(value, list.getSize());
		}
	}
	
	public boolean isEmpty() {
		if(list.getHead() == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("queue is empty.......");
			return;
		}else {
			System.out.println(list.getHead().getValue());
			list.deleteNode(0);
		}
	}
	
	public void peek() {
		if(isEmpty()) {
			return;
		}else {
			System.out.println(list.getHead().getValue());
		}
	}
	
	public void delete() {
		list.setHead(null);
		list.setTail(null);
	}
}
