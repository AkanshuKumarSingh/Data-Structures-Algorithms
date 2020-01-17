package queue;

public class QueueByArray {
	int[] arr;
	int topOfQueue;
	int begOfQueue;

	public QueueByArray(int size) {
		topOfQueue = -1;
		begOfQueue = -1;
		arr = new int[size];
		System.out.println("queue successfuly created...........");
	}

	public boolean isFull() {
		if (topOfQueue == arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpty() {
		if (begOfQueue == -1) {
			return true;
		} else {
			return false;
		}
	}

	public void enQueue(int value) {
		if (isFull()) {
			System.out.println("queue is full");
			return;
		} else if (isEmpty()) {
			arr[++topOfQueue] = value;
			begOfQueue = 0;
			System.out.println("value inserted at the begining....");
		} else {
			arr[++topOfQueue] = value;
			System.out.println("value inserted");
		}
	}

	public void deQueue() {
		if (isEmpty()) {
			System.out.println("empty queue...");
		} else {
			begOfQueue++;
			if (begOfQueue > topOfQueue) {
				begOfQueue = -1;
				topOfQueue = -1;
			}
		}
	}

	public void print() {
		if (isEmpty()) {
			return;
		} else {
			for (int i = begOfQueue; i <= topOfQueue; i++) {
				System.out.println(arr[i]);
			}
		}
	}

	public void peek() {
		if (isEmpty()) {
			return;
		} else {
			System.out.println(arr[begOfQueue]);
		}
	}
	
	public void delete() {
		arr = null;
		System.out.println("queue has beeen deleted");
	}
}
