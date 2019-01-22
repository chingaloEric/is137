//linealize the arrays

public class Array{
    public static void main(String[] args) {
        int myArray[][] = {{10,20,30}, {40, 50}, {60}};
        linearize(myArray);
    }

    public static void linearize(int myArray[][]) {
        int size = 0;

        for(int i = 0; i<myArray.length; i++){
            size += myArray[i].length;
        }
        int newArray[] = new int[size];
        int n = 0;

        for(int i=0; i<myArray.length; i++){
            for(int j=0; j<myArray[i].length; j++){
                newArray[n] = myArray[i][j];
                n++;
            }
        }

        	//for printing
        for(int i=0; i<newArray.length; i++){
            System.out.printf("%d ",newArray[i]);
        }
        System.out.println(" ");
    }
}
