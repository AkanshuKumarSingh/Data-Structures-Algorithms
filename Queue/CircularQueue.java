package queue;

import java.util.*;


public class CircularQueue {
	List<Integer> l = new ArrayList<>();
	int[] arr;
	int start;
	int toq;
	int size;

	public CircularQueue(int size) {
		arr = new int[size];
		start = -1;
		this.size = size;
		toq = -1;
		System.out.println("circular qyeye created...");
	}

	public boolean isEmpty() {
		if (toq == -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (start == 0 && toq + 1 == size) {
			return true;
		} else if (start == toq + 1) {
			return true;
		} else {
			return false;
		}
	}

	public void enQueue(int value) {
		if (isFull()) {
			return;
		} else if (start == -1) {
			arr[++toq] = value;
			start++;
		} else if (start == 0) {
			arr[++toq] = value;
		} else if (toq == size - 1) {
			toq = 0;
			arr[toq] = 0;
		} else {
			arr[++toq] = value;
		}
	}

	public void deQueue() {
		if (isEmpty()) {
			return;
		} else {
			arr[start] = 0;
			if (start == toq) {
				start = toq = -1;
			} else if (start == size - 1) {
				start = 0;
			} else {
				start++;
			}
		}
	}

	public void print() {
		if (isEmpty()) {
			return;
		} else {
			if (start <= toq) {
				for (int i = start; i <= toq; i++) {
					System.out.println(arr[i]);
				}
			} else if (start > toq) {
				for (int i = start; i < size; i++) {
					System.out.println(arr[i]);
				}
				for (int j = 0; j <= toq; j++) {
					System.out.println(arr[j]);
				}
			}
		}
	}

	void peek() {
		if (isEmpty()) {
			System.out.println("queue is empty..");
			return;
		} else {
			System.out.println(arr[start]);
		}
	}

	void delete() {
		arr = null;
		System.out.println("array has been deleted ");
	}
}
