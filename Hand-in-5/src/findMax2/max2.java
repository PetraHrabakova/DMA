package findMax2;
import java.io.*;
import java.util.*;

public class max2
{
  public int findMax2(int[] input)
  {
    // TODO implement method
    int maxValue = input[0];
    for (int i = 1; i < input.length; i++) {
      if (input[i] > maxValue) {
        maxValue = input[i];
      }
    }
    return maxValue;
  }
}
