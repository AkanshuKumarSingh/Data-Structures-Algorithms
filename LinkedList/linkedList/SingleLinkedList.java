package LinkedList.linkedList;

import LinkedList.node.SingleNode;

public class SingleLinkedList {

	private SingleNode head;
	private SingleNode tail;
	private int size;
	
	public void createSingleLinkedList(int value) {
//		head = new SingleNode();
		SingleNode node = new SingleNode();
//		System.out.println(node);
		node.setValue(value);
		node.setNext(null);
//		node = null;
		head = node;
		tail = node;
		size = 1;
//		return head;
	}
	
	public void insertLinkedList(int nodeValue,int location) {
		SingleNode tempNode = head;
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		if(!exitsLinkedList()) {
		System.out.println("linked list does not exists !!!");	
		}else if(location == 0){
			node.setNext(head);
			head = node;
		}else if(location>=size) {
			node.setNext(null);
			tail.setNext(node);
			tail = node;
		}else {
			for(int i=0;i<location-1;i++) {
				tempNode = tempNode.getNext();
			}
			node.setNext(tempNode.getNext());
			tempNode.setNext(node);
		}
		size++;
//		System.out.println("....." + node.getValue());
	}
	public void searchNode(int nodeValue) {
		SingleNode tempVar = head;
		for(int i=0;i<size;i++) {
			if(tempVar.getValue() == nodeValue) {
				System.out.println("\nposition is : " + i );
				return;
			}
			tempVar = tempVar.getNext();
		}
		System.out.println("not found!!!");
		
	}
	
	public boolean exitsLinkedList() {
		return (head != null);
	}
	public void traverseLinkedList() {
		try {
			SingleNode tempNode = head;
//		System.out.println(head.getNext());
//		System.out.println(tempNode);
			if(head == null) {
				System.out.println("linked list doesn't exist !!!");
			}else {
			for(int i=0;i<size;i++) {
				if(i >=1) {
					System.out.print("->");
				}
				System.out.print(tempNode.getValue());
				tempNode = tempNode.getNext();
			}
			}	
		} catch (Exception e) {
			System.out.println("cannot be shown");
		}
		int i1 =0;
		SingleNode temp = head;
		while(temp.getNext() != null) {
			temp = temp.getNext();
			i1++;
		}
		temp = temp.getNext();
		
		System.out.println("\n" + i1);
	}
	
	public void deleteNode(int location) {
		SingleNode tempVar = head;
		if(!exitsLinkedList()) {
			System.out.println("linked list not exists....");
		}else if(location == 0) {
			head = head.getNext();
			if(size == 1) {
				tail = null;
			}
		}else if(location+1 >= size) {
			for(int i=0;i<size-2;i++) {
				tempVar = tempVar.getNext();
			}if(tempVar == head) {
			head = null;
			tail = null;
			}
			else {
			tempVar.setNext(null);
			tail = tempVar;
			}
		}
		else {
			for(int i=0;i<location-1;i++) {
			tempVar = tempVar.getNext();	
			}
			tempVar.setNext(tempVar.getNext().getNext());
		}
		size--;
	}
	
	public void deleteLinkedList() {
		head = null;
		tail = null;
		System.out.println("linked list has been deleted!!!");
		
	}
	
	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();
		SingleNode sn = new SingleNode();
		sll.createSingleLinkedList(4);
		sll.traverseLinkedList();
		System.out.println("...........");
		sll.insertLinkedList(2,0);
		sll.traverseLinkedList();
		System.out.println("...........");
		sll.insertLinkedList(78,0);
		sll.traverseLinkedList();
		System.out.println("...........");
		sll.insertLinkedList(7,9);
		sll.traverseLinkedList();
		System.out.println("...........");
		sll.insertLinkedList(66,5);
		sll.traverseLinkedList();
		System.out.println("...........");
		sll.insertLinkedList(89,2);
		sll.traverseLinkedList();
		System.out.println("...........");
		sll.insertLinkedList(98,4);
		sll.traverseLinkedList();
		sll.searchNode(89);
		sll.deleteNode(3);
		sll.traverseLinkedList();
		System.out.println("...........");
		sll.deleteNode(0);
		sll.traverseLinkedList();
		System.out.println("...........");
		sll.deleteNode(7);
		sll.traverseLinkedList();
		System.out.println("...........");
	//	sll.deleteLinkedList();
		System.out.println("...........");
		sll.traverseLinkedList();

//		System.out.println("................");
//		sll.insertLinkedList(2,0);
//		System.out.println("................");
//		sll.insertLinkedList(32,0);
//		System.out.println("................");

//		sll.insertLinkedList(9,2);
//		sll.insertLinkedList(1,1);
//		sll.traverseLinkedList();


	}

	@Override
	public String toString() {
		return "SingleLinkedList [head=" + head + ", tail=" + tail + ", size=" + size + "]";
	}

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
	
}
