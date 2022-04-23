package GCD;

public class GCD
{
  // Euclidean algorithm is the most simple to implement

  public int findGCD1(int a, int b)
  {
    int gcd = 0;
    for (int i = 1; i <= a && i <= b; i++) {
      if(a % i == 0 && b % i == 0) {
        gcd = i;
      }
    }
    // Implement your method here that uses for loop
    return gcd;
  }

  public int findGCD2(int a, int b)
  {
    // Implement your method here that uses a while loop
    while(a != b) {
      if (a > b) {
        a -= b;
      }
      else {
        b -= a;
      }
    }
    return b;
  }

  public int findGCD3(int a, int b)
  {
    // Implement your method here that calls itself
    if (b != 0) {
      return findGCD3(b, a % b);
    }
    else
      return a;
  }
}
