public class Postfix{
	public static void main(String[] args) {
		String expression[] = {"6", "5", "2", "3", "+", "8", "*" , "+", "3", "+", "*"};
		System.out.println("Result: " + postfixEvaluator(expression));
	}

	public static double postfixEvaluator(String[] entry){
		StackList stack = new StackList();
		for(int i=0; i<entry.length; i++){
			if(entry[i] == "+"){
				stack.push(stack.pop() + stack.pop());
			}else if(entry[i] == "-"){
				stack.push(-stack.pop() + stack.pop());
			}else if(entry[i] == "/"){
				stack.push(stack.pop() / stack.pop());
			}else if(entry[i] == "*"){
				stack.push(stack.pop() * stack.pop());
			}else{
				double num = Double.parseDouble(entry[i]);
				stack.push(num);
			}
		}

		return stack.peek();
	}
}