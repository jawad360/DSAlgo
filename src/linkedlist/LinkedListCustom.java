package linkedlist;

public class LinkedListCustom {
	
	private Node head = null;
	
	private static class Node {
		private int data;
		private Node next;
		Node(){
			this.data = data;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}
	
	
}
