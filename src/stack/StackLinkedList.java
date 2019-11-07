package stack;

public class StackLinkedList {
	
	private StackNode head = null;
	
	private static class StackNode {
		private int data;
		private StackNode next;
		
		StackNode(int data){
			this.data = data;
		}
	}
	
	public boolean isEmpty() {
		return head == null ? true : false;
	}
	
	public boolean push(int data) {
		StackNode node = new StackNode(data);
		if(head == null) {
			head = node;
		}
		else {
			node.next = head;
			head = node;
		}
		System.out.println("Data added: " + data);	
		return true;
	}
	
	public int pop() {
		int popped = 0;
		if(head == null) {
			System.out.println("Stack underflow");
		}
		else {
			popped = head.data;
			head = head.next;
		}
		return popped;
	}
	
	public int peek() {
		int popped = 0;
		if(head == null) {
			System.out.println("Stack underflow");
		}
		else {
			return head.data;
		}
		return popped;
	}
}	
