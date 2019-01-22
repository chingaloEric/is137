class Node{
	private char value;
	private Node next;

	public Node(char v){
		this(v, null);
	}
	public Node(char v, Node n){
		value = v;
		next = n;
	}

	public void setValue(char newValue){
		value = newValue;
	}
	public char getValue(){
		return value;
	}
	public void setNext(Node n){
		next = n;
	}
	public Node getNext(){
		return next;
	}
}

public class Stack{
	public Node top;
	public Stack(){
		top = null;
	}
	public boolean isEmpty(){
		return top == null;
	}
	public void push(char x){
		top = new Node(x, top);
	}

	public  char pop(){
		if(!isEmpty()){
			Node temp = top;
			top = top.getNext();
			return temp.getValue();
			
		}else{
			System.out.println("Error!! Empty stack");
			return '0';
		}
	}
	public  void popAll(){
		Node top;
		top = null;
	}

	public  char peek(){
		return top.getValue();  	
	}

	public void printAll(){
		Node point = top;
      while(point != null){
        System.out.print(point.getValue() + " ");
        point = point.getNext();
      }
    }
}
