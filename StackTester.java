package stack;

public class StackTester {

	public static void main(String[] args) {
		Stack<String> newStack = new Stack<String>();
		
		
		newStack.peek();
		newStack.push("hello");
		newStack.push("world");
		newStack.push("what");
		newStack.push("is");
		newStack.printStack();
		System.out.println(newStack.getLength());
		
	}

}
