package LinkedList.linkedList;

public class QueueByLinkedListMain {

	public static void main(String[] args) {
		QueueByLinkedList q = new QueueByLinkedList();
		q.enQueue(2);
		q.enQueue(9);
		q.enQueue(4);
		q.peek();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.delete();
		q.deQueue();

	}

}
