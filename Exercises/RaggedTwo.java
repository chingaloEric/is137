//isEquals- it checks if the arrays are equal --version2

public class RaggedTwo{
    public static void main(String[] args) {
        int arrayA[][] = {{1,21, 32, 32}, {12, 12} ,  {23, 21}};
        int arrayB[][] = { { 1, 21, 32, 32 },{3}, { 23, 21 } };
	boolean check = true;
        check = equals(arrayA, arrayB);
	if(check == false){
            System.out.println("Not equal");
        }else{
            System.out.println("Equal");
        }

    }

    public static boolean equals(int[][] arrayA, int[][] arrayB){
        
        if(arrayA.length != arrayB.length){
            System.out.println("Not equal");
            return false;
        }

        for(int i=0; i<arrayA.length; i++){
            if(arrayA[i].length != arrayB[i].length){
                return false;
            }
        }

        for(int k=0; k<arrayA.length; k++){
            for(int j=0; j<arrayA[k].length; j++){
                if(arrayA[k][j] != arrayB[k][j]){
                    return false;
                }
            }
        }
        
        return true;
    }
}
