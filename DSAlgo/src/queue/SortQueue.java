package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class SortQueue {
	public static void main(String[] args) {
		Queue<Integer> unsorteQ = new LinkedList<Integer>();
		Scanner scan = new Scanner(System.in);
		unsorteQ.add(5);
		unsorteQ.add(1);
		unsorteQ.add(2);
//		unsorteQ.add(6);
		unsorteQ.add(3);
		unsorteQ.add(4);
		if(checkIfSorted(unsorteQ))
			System.out.println("YES");
		else
			System.out.println("NO");
		scan.close();
	}
	
	public static boolean checkIfSorted(Queue<Integer> unsorteQ) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Stack<Integer> stack = new Stack<Integer>(); 
		
		int expected = 1;
		while(unsorteQ.size() != 0) {
			if(unsorteQ.peek() == expected) {
				queue.add(unsorteQ.poll());
				expected++;
			}
			else {
				if(stack.size() == 0)
					stack.push(unsorteQ.poll());
				else if(stack.peek() > unsorteQ.peek())
					stack.push(unsorteQ.poll());
				else
					return false;
				while(stack.size() != 0 && stack.peek() == expected)
					queue.add(unsorteQ.poll());
			}			
		}
		return true;
	}
}
