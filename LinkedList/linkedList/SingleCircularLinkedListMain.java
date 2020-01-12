package LinkedList.linkedList;

public class SingleCircularLinkedListMain {

	public static void main(String[] args) {
		SingleCircularLinkedList scll = new SingleCircularLinkedList();
		scll.createLinkedList(9);
		scll.traverseLinkedList();
		scll.insertLinkedList(2,9);
		scll.traverseLinkedList();
		scll.insertLinkedList(12, 1);
		scll.traverseLinkedList();
		scll.insertLinkedList(3,2);
		scll.traverseLinkedList();
		scll.printHeadUsingTail();
		scll.deleteLinkedList(1);
		scll.traverseLinkedList();
		scll.deleteLinkedList(0);
		scll.traverseLinkedList();
		scll.deleteLinkedList(9);
		scll.traverseLinkedList();
		scll.insertLinkedList(2,9);
		scll.insertLinkedList(1,78);
		scll.traverseLinkedList();
		scll.insertLinkedList(3,3);
		scll.insertLinkedList(5,99);
		scll.insertLinkedList(7,4);
		scll.traverseLinkedList();
		System.out.println(scll.searchNode(7));
		scll.deleteLL();
		scll.traverseLinkedList();
//		scll.insertLinkedList(nodeValue, location);		
	}

}
