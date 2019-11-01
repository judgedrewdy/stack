package stack;

public class Stack<T> {
	
	int size;
	
	Node<T> top;
	
	public Stack() {
		size = 0;
		top = null;
	}
	
	public void push(T value) {
		if (top == null) {
			Node<T> newNode = new Node<T>(value, null);
			top = newNode;
		}
		else {
			Node<T> newNode = new Node<T>(value, top);
			top = newNode;
		}
	}
	
	public T pop() {
		if (top == null) {
			return null;
		}
		else {
			T popped = top.value;
			top = top.next;
			return popped;
		}
	}
	
	public T peek() {
		if (top == null) {
			return null;
		}
		else {
			return top.value;  //try no branches just top.value
		}
	}
	
	public boolean isEmpty() {
		if (top == null) {
			return true;
		}
		return false;
	}
	
	public int getLength() {
		Node<T> curNode = top;
		int count = 0;
		while (curNode != null) {
			curNode = curNode.next;
			count++;
		}
		return count;
	}
	
	public void printStack() {
		listTraverse(top);
	}
	
	private void listTraverse(Node<T> node) {
		
		if (node != null) {
			System.out.print(node.value + " ");
			listTraverse(node.next);
		}
		
	}
	
	
	
}
