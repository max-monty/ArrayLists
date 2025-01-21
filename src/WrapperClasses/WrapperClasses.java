package WrapperClasses;

import java.util.ArrayList;

public class WrapperClasses
{
   public static void main(String[] args)
   {
      //Some primitive types
      char letter = 'A';
      boolean value = true;
      int intNum = -269;
      double floatNum = Math.pow(2,2); // 2 to the 2 is 4

      //Converting them into objects via their wrapper classes
      Character Letter = (Character) letter;
      Boolean Value = (Boolean) value;
      Integer IntNum = (Integer) intNum;
      Double FloatNum = (Double) floatNum;

      //Wrapper objects print their value just fine
      System.out.println("" + Letter + " " + Value + " " + IntNum + " " + FloatNum);

      //Some Numerical objects
      Long Num1 = 987L;
      Float Num2 = 34.56f;

      //Turning them into primitive types
      long num1 = (long) Num1;
      float num2 = (float) Num2;

      System.out.println("" + num1 + " " + num2);

      // ArrayLists cannot be instantiated with primitive types
      // ArrayList<int> bad = new ArrayList<int>(); // ===> bad

      // They must be instantiated to a hold reference type (use wrapper classes)
      ArrayList<Integer> good = new ArrayList<Integer>();
      good.add(5);
      good.add(intNum);
   }
}