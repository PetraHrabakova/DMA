package decToBinary;

import java.lang.reflect.Array;
import java.util.Scanner;

public class dec2Bin
{
  public static String convertDec2Bin(int n)
  {
    // We initialise an output as a string
    String binaryNum = "";

    // We throw an exception if there is an illegal input
    if (n < 0)
    {
      throw new IllegalArgumentException();

      // TODO implement method
    }
    else {
      while (n > 0) {

        // sqrt(17) is 4 and something but it is an int so it will return only 4 which is the amount of times the loop
        // needs to iterate
        for (int i = 0; i < Math.sqrt(n); i++) {
          binaryNum = n % 2 + binaryNum;     // Save n % 2 at the beginning of the String
          n = n / 2;                       // Divide by 2 to move to the next binary position
        }
      }
    }


    return binaryNum;
  }

  public static void main(String[] args)
  {
    while (true)
    {
      System.out.println("Type input:");
      Scanner in = new Scanner(System.in);
      int read = in.nextInt();
      System.out.println(convertDec2Bin(read));
      System.out.println();
    }
  }
}
