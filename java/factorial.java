import java.util.*;

public class Factorial {
	
	public static long factorial(int n){
		if(n<2)
			return 1;
		else
			return n*factorial(n-1);
	}

	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt;
		System.out.println("Answer= " + factorial(num));
	}

}

