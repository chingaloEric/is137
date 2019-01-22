import java.util.*;

public class New{
    public static void main(String[] args) {
        int myArray[]= new int[5];
        myArray[0] = 2;
        myArray[1] = 22;
        myArray[2] = 43;
        myArray[3] = 13;
       
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Array:");

//mathod call for insert
        myArray = insterItem(myArray, num);
       
        //displays array
        for (int j = 0; j < 5; j++) {
            System.out.println(myArray[j]);
        }
        System.out.println("Which element to delete");
        int num2 = input.nextInt();

//mathod call for delete
        myArray = deleteItem(myArray, num2);
        input.close();
        
        //displays array
        for (int j = 0; j < 5; j++) {
            System.out.println(myArray[j]);
        }
    }


    // question4-inserts items
    public static int[] insterItem(int[] theArray, int num) {
        for(int i=0; i<5; i++){
            if(theArray[i] == 0){
                theArray[i] = num;
                break;
            }
            
        }
        return theArray;
    }
     
    //question5-deletes items
    public static int[] deleteItem(int[] theArray, int num2) {
        for(int m=0; m<5; m++){
            if(theArray[m] == num2){
               for(int j = m; j<4; j++){
                    theArray[j] = theArray[j + 1];
               }
                theArray[4] = 0;
                 break;
             }
    } 
    return theArray;
    }
}
