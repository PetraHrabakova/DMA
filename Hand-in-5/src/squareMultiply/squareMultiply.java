package squareMultiply;

import java.math.BigDecimal;
import java.math.BigInteger;

public class squareMultiply
{
  public int modExpoCalculator(int base, int exponent, int modulo)
  {
    int result = 1;

    base = base % modulo;                   // Just to make sure base is more or equal to modulo

    while (exponent > 0) {                  // While exponent is larger than 0
      if (exponent % 2 == 1) {              // If exponents is odd
        result = (result * base) % modulo;  // Multiply result with base and mod
      }
      exponent /= 2;                        // Divide exponent by two to move to the next binary position
      base = (base * base) % modulo ;
    }

    // Implement method here
    return result;
  }

}
