package queue;

public class QueueByArrayMain {

	public static void main(String[] args) {
		QueueByArray q = new QueueByArray(4);
		q.enQueue(1);
		q.enQueue(8);
		q.enQueue(7);
		q.print();
		System.out.println("...................");
		q.deQueue();
		q.print();
		System.out.println("...................");
		q.enQueue(1);
		q.enQueue(8);
		q.enQueue(7);
		q.deQueue();
		q.peek();
		q.print();
		q.delete();
		q.print();
	}

}
