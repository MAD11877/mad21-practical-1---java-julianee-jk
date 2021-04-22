import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int totalInt = in.nextInt();
    int input = 0;
    int arr[];
    arr = new int[totalInt];

    for (int i=0; i < totalInt; i++) {
      input = in.nextInt();
      arr[i] = input;
    }

    int maxCount = 0;
    int modeValue = 0;
    int count = 0;
    for (int x = 0; x < arr.length; ++x) {
      count = 1;
      int value = arr[x];
      for (int y = 0; y < arr.length; ++y) {
        if (arr[x] == arr[y]) {
          count++; 
        }
        if (count > maxCount) {
          maxCount = count;
          modeValue = value;
        }
      }
    }
    System.out.println("Mode: " + modeValue);
  }
}