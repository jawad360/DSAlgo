package queue;

public class QueueArray {
	private int size, capacity, front, rear;
	private int queue[];
	
	public QueueArray(int capacity){
		this.capacity = capacity;
		queue = new int[capacity];
		front = -1;
		rear = -1;
	}
	
	public boolean isFull() {
		return capacity == size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(int data) {
		if(isFull())
			System.out.println("Queue is full!!");
		else {
			rear = (rear + 1)%capacity;
			if(front == -1)
				front++;
			queue[rear] = data;
			size++;
			System.out.println("Data pushed "+data);
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty!!");
			return 0;
		}
		else {
			int data = queue[front];
			front = (front + 1)%capacity;
			size--;
			System.out.println("Data removed  "+data);
			return data;
		}
	}
	
	public int front() {
		if(isEmpty()) {
			System.out.println("Queue is empty!!");
			return 0;
		}
		else
			return queue[front];
	}
	
	public int rear() {
		if(isEmpty()) {
			System.out.println("Queue is empty!!");
			return 0;
		}
		else
			return queue[rear];
	}
	
}
