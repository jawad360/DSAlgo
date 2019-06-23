package Stack;

import java.util.Stack;

public class InfixToPostfixStack {
	
	public static void main(String[] args) {
		 String exp = "a+b*(c^d-e)^(f+g*h)-i"; 
	     System.out.println(new InfixToPostfixStack().infixToPostfix(exp)); 
	}
	
	public String infixToPostfix(String exp) {
		Stack<Character> stack = new Stack<Character>(); 
		String result = new String("");
		for(int i=0; i<exp.length(); i++) {
			char c = exp.charAt(i);
			if(Character.isLetterOrDigit(c)) {
				result += exp.charAt(i);
			}
			else if(c == '(') {
				stack.push(c);
			}
			else if(c == ')') {
				while(!stack.isEmpty() && stack.peek() != '(')
					result += stack.pop();
				stack.pop(); 
			}
			else {
				while(!stack.isEmpty() && prec(c) <= prec(stack.peek()))
					result += stack.pop();
				stack.push(c);
			}
		}
		while(!stack.isEmpty())
			result += stack.pop();
			
		return result;
	}
	
	private int prec(char ch) {
		switch(ch){
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default:
			return -1;
		}
	}
}
