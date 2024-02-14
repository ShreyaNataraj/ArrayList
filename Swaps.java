import java.util.*;
public class Swaps {
  public static void main(String[] args) {
    ArrayList<Integer>list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    //using set function
    list.set(1,3);
    list.set(2,2);
    System.out.println(list);

  }
}
