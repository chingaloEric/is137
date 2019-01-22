public class Palindrome{
	public static void main(String[] args) {
		String word = "ana";
		System.out.println("Is " + word + " a palindrome?: " + isPalindrome(word));
	}

	public static boolean isPalindrome(String text){
		Stack stack = new Stack();
		Queue queue =  new Queue();
		for(int i=0; i<text.length() ; i++ ){
			stack.push(text.charAt(i));
			queue.enqueue(text.charAt(i));
		}
		for(int j=0; j<text.length() ; j++ ){
				if(stack.pop() != queue.dequeue()){
					return false;
			}
		}

		return true;
		
	}
}