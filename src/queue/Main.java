package queue;

public class Main {
	public static void main(String[] args) {
		QueueArray qa = new QueueArray(10);
		qa.enqueue(10);
		qa.enqueue(15);
		qa.enqueue(1);
		System.out.println("Front "+qa.front());
		qa.dequeue();
		qa.dequeue();
		qa.dequeue();
		System.out.println("Front "+qa.front());
	}
}
