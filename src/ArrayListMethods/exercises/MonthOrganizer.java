package ArrayListMethods.exercises;

import java.util.ArrayList;

/*

The ArrayList *months* stores the months of every year in 
chronological order, from January to December.

To complete it, the following lines will be added at the end
(after December is appended).


1. months.add(2, "March");
2. months.add(5, "September");
3. months.add(6, "August");
4. months.add(2, "April");

#### In which order should the previous lines appear?

*/

public class MonthOrganizer
{
   public static void main(String[] args)
   {
      ArrayList<String> months = new ArrayList<>(12);
      months.add("January");
      months.add("February");
      months.add("May");
      months.add("June");
      months.add("July");
      months.add("October");
      months.add("November");
      months.add("December");

      System.out.println(months);
   }
}