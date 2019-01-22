//check Ragged --version1


public class Question1{
    public static void main(String[] args) {
        int arrayA[][] = {{1,21, 32, 32}, {3} ,  {23, 21}};
        isRagged(ragged);
    }

    public static void isRagged(int[][] ragged) {
        if (ragged[0].length != ragged[1].length) {

            System.out.println("Thi is ragged");
        }

        else if (ragged[0].length != ragged[2].length) {

            System.out.println("ragged");
        } else {

            System.out.println("Thi is NOT ragged");
        }

    }

}
