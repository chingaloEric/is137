/**********Queue implimentantion by Linked Lists************/

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

public class Queue{
	private Node front;
	private Node rear;
	private char counter;

	public Queue(){
		rear = front =  null;
		counter = 0;
	}

	public boolean isEmpty(){
		return counter == 0;
	}

	public void enqueue(char val){
		Node newNode = new Node(val, null);
		if(isEmpty()){
			rear = newNode;
			front = newNode;
		}else{
			rear.setNext(newNode);
			rear = newNode;
		}
		counter++;
	}

	public char dequeue(){
		if(!isEmpty()){
			char val = front.getValue();
			front = front.getNext();
			counter --;
			return val;
		}else{
			System.out.println("Error! Empty Queue");
			return '1';
		}
	}

	}
