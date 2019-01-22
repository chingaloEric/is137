class Node{
	private Double value;
	private Node next;

	public Node(Double v){
		this(v, null);
	}
	public Node(Double v, Node n){
		value = v;
		next = n;
	}

	public void setValue(Double newValue){
		value = newValue;
	}
	public Double getValue(){
		return value;
	}
	public void setNext(Node n){
		next = n;
	}
	public Node getNext(){
		return next;
	}
}

public class StackList{
	public Node top;
	public StackList(){
		top = null;
	}
	public boolean isEmpty(){
		return top == null;
	}
	public void push(Double x){
		top = new Node(x, top);
	}

	public  Double pop(){
		if(!isEmpty()){
			Node temp = top;
			top = top.getNext();
			return temp.getValue();
			
		}else{
			System.out.println("Error!! Empty stack");
			return -1.0;
		}
	}
	public  void popAll(){
		Node top;
		top = null;
	}

	public  Double peek(){
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
