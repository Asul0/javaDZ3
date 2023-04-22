import java.util.*;

public class task2 {
   public static void main(String[] args) {
      List<Integer> list = new ArrayList<>(Arrays.asList(3, 7, 1, 8, 2, 5, 4));

      // удаление четных чисел из списка
      Iterator<Integer> iterator = list.iterator();
      while (iterator.hasNext()) {
         int number = iterator.next();
         if (number % 2 == 0) {
            iterator.remove();
         }
      }

      System.out.println(list); // [3, 7, 1, 5]
   }
}
