import java.util.*;
public class binarySubString{
  public static void main(String[] args){

    // start by declaring 3 variables
    // int result will be the amount of binary substrings that are found
    // int consecutiveZeroes will be the amount of back to back zeroes found
    // int consecutiveOnes will be the amount of back to back ones found
    // initialize all to 0
    int result = 0;
    int consecutiveZeroes = 0;
    int consecutiveOnes = 0;

    // generate a binary string to be iterated through

    String s = "1101";

    // as with almost all String iterations, use a for loop to hop through each character
    for (int i = 0; i < s.length(); i++){
      // two cases of string, where it equals 0, and 1
      if (s.charAt(i) == '0'){
        // case 1: where the character is 0
        //    if the previous character is 1, then the amount of consecutive zeroes is 0
        //    else the previous one is zero, and one is to the count
        if (i - 1 >= 0 && s.charAt(i) == '1') consecutiveZeroes = 0;
        consecutiveZeroes++;
        if (consecutiveZeroes >= consecutiveOnes) result++;
      }else{
        // case 2: where the character is 1
        //    if the previous character is 0, then the amount of consecutive ones is 0, reset
        //    else the previous one is  1, and one is to the count
        if (i - 1 >= 0 && s.charAt(i) == '0') consecutiveOnes = 0;
        consecutiveOnes++;
        if (consecutiveOnes >= consecutiveZeroes) result++;
      }

    }
    // unit test
    System.out.println("Code should produce 3");
    System.out.println("Code actually produced: " + result);
  }
}
