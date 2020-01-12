package LinkedList.linkedList;

public class DoubleLinkedListMain {

	public static void main(String[] args) {
		DoubleLinkedList dll = new DoubleLinkedList();
		dll.createDoubleLinkedList(1);
		dll.traverseLinkedList();
		dll.insertDLL(2,4);
		dll.traverseLinkedList();
		dll.insertDLL(8,4);
		dll.traverseLinkedList();
		dll.insertDLL(2,0);
		dll.traverseLinkedList();
		dll.insertDLL(99,2);
		dll.traverseLinkedList();
		dll.traverseLLInReverse();
		dll.searchNode(8);
		dll.deletionOfNode(3);
		dll.traverseLinkedList();
		dll.deleteDLL();
		dll.traverseLinkedList();

	}

}
