import java.util.*;
import java.io.*;

public class javaprog {
	private static final String DIGIT_TABLE = "0123456789abcdef";
	private static final int MAX_BASE = DIGIT_TABLE.length();
	
	public static void printNumInNewBase(long n, int base){
		if (n >= base)
			printNumInNewBase(n/base, base);
		System.out.print(DIGIT_TABLE.charAt((int)(n % base)));
		
	}
	

	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number value, folowed by base");
		
		long M = input.nextLong();
		int N = input.nextInt();
		
		
		printNumInNewBase(M,N);
	
	}
}

