package Stack;

public class StackArray {
	private int maxSize;
	private int[] stack;
	private int head;
	
	public StackArray(int size){
		this.maxSize = size;
		this.stack = new int[maxSize];
		this.head = -1;
	}
	
	public boolean isEmpty() {
		return head == -1 ? true : false;
	}
	
	public boolean push(int data) {
		if(head == maxSize - 1) {
			System.out.println("Stack overflow");
			return false;
		}
		else {
			stack[++head] = data;
			System.out.println("Data added: "+data);	
			return true;
		}
	}
	
	public int pop() {
		if(head == -1) {
			System.out.println("Stack underflow");
			return 0;
		}
		else {
			int data = stack[--head];
			return data;
		}
	}
	
	public int peek() {
		if(head == -1) {
			return 0;
		}
		else {
			return stack[head];
		}
	}
}
