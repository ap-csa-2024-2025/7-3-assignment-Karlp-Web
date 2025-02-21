import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    ArrayList <String> foo = new ArrayList <String> ();
    foo.add("a");
    foo.add("b");
    foo.add("c");
    foo.add("d");
    foo.add("e");
    foo.add("f");
    System.out.println("main- ArrayList before the function is run: " + foo);
    shiftLeft(food);
    System.out.println("main- checking that the ArrayList has been changed " + foo);
  }


//ex) if had a b c d e f -> b c d e f a
//since can change size, can append front to back and also remove the font as well
  public static void shiftLeft(ArrayList<String> arr)
  {
    System.out.println("func- ArrayList orginal: " + arr);
    String front = arr.remove(0);
    System.out.println("func- ArrayList after removing first emelent: " + arr);
    arr.add(front);
    System.out.println("func- ArrayList after appending first element: " + arr);
  }

  public static void printStatistics(final ArrayList<Integer> arr)
  {
    double sum = 0;
    for (Integer elem : arr)
    {
      sum += elem.intvalue();
    }
    System.out.println("Sum is: " + sum);

    double average = sum / arr.size();
    System.out.println("The average is: " average);

    int count = 0;
    int maxCount = 0;
    int mode = arr.get(0);
    (int i; i < arr.size(); i++)
    {
      if (arr.get(i).equals())
      {

      }
    }
  }
}
