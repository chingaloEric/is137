import java.io.*;

//check ragged arrays:

public class IsRagged{
	public static void main(String[] args){
		int[][] array = {{12, 12, 2}, {12, 23}};
		isRagged(array);
	}
		
	public static void isRagged(int[][] i){
			int notRagged = 0; //counter variable
			for(int row = 0; row<i.length - 1; row++){
				if(i[row].length != i[row + 1].length ){
					notRagged++;
				}else if(notRagged > 0){
					break;
				}
			}
			if(notRagged == 0){
			System.out.println("Not ragged");
			}else{
			System.out.println("Ragged");
			}
	}
}
