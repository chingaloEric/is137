
public class Ragged{
    public static void main(String[] args) {
        int arrayA[][] = {{1,21, 32, 32}, {3} ,  {23, 21}};
        int arrayB[][] = { { 1, 21, 32, 32 },{3}, { 23, 21 } };
        equals(arrayA, arrayB);

    }

    public static void equals(int[][] arrayA, int[][] arrayB){
        boolean check = true;
        if(arrayA.length != arrayB.length){
            System.out.println("Not equal");
            return;
        }

        for(int i=0; i<arrayA.length; i++){
            if(arrayA[i].length != arrayB[i].length){
                check = false;
                break;
            }
        }

        for(int k=0; k<arrayA.length; k++){
            for(int j=0; j<arrayA[k].length; j++){
                if(arrayA[k][j] != arrayB[k][j]){
                    check = false;
                    break;
                }
            }
        }
        
        if(check == false){
            System.out.println("Not equal");
        }else{
            System.out.println("Equal");
        }
    }

}
