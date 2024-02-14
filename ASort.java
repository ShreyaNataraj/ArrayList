import java.util.*;
public class ASort {
  public static void main(String[] args) {
    ArrayList<Integer>list = new ArrayList<>();
    //Collections.sort
    //Collections.reverseOrder());
    list.add(5);
    list.add(3)  ;
    list.add(8);
    Collections.sort(list,Collections.reverseOrder());
    System.out.println(list);
  }

}
