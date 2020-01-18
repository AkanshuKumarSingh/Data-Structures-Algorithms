package queue;

public class CircularQueueMain {

	public static void main(String[] args) {
		CircularQueue c = new CircularQueue(4);
		c.enQueue(3);
		c.enQueue(7);
		c.enQueue(4);
		c.print();
		System.out.println("..................");
		c.deQueue();;
		c.print();
		c.peek();
	}

}
