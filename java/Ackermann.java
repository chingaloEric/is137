import java.util.*;
import java.io.*;

public class Ackermann {

	   public static double ackermann(double m, double n) {
	      if (m == 0) return n + 1;
	      if (n == 0) return ackermann(m - 1, 1);
	      return ackermann(m - 1, ackermann(m, n - 1));
	   }

	   public static void main(String[] args) {
	      double M = 3;
	      double N = 13;
	      System.out.println(ackermann(M, N));
	   }
	} 
