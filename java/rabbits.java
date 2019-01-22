import java.util.*;


public class Rabbits {
	
	public static int rabbit(int n){
		if(n<=1){
			return 1;
		}
		else{ return rabbit(n-1)+rabbit(n-2);}
	}

	
	public static void main(String[] args){
		int num;
		Scanner input =  new Scanner(System.in);
		num = input.nextInt();
		input.close();
		System.out.println(rabbit(num));
	}

}
