package stack;

public class Main {
	
	public static void main(String[] args) {
		Main main = new Main();
		//main.exeStackArray();
		main.exeStackLinkedList();
	}
	
	public void exeStackArray() {
		System.out.println("Stack Array ========");
		StackArray stack = new StackArray(100);
		stack.push(10);
		stack.push(3);
		stack.push(8);
		System.out.println("Peek "+ stack.peek());
		stack.pop();
		System.out.println("Peek "+ stack.peek());
	}
	
	public void exeStackLinkedList() {
		System.out.println("Stack Linked List ========");
		StackLinkedList stack = new StackLinkedList();
		stack.push(10);
		stack.push(3);
		stack.push(8);
		System.out.println("Peek "+ stack.peek());
		stack.pop();
		System.out.println("Peek "+ stack.peek());
	}
}
