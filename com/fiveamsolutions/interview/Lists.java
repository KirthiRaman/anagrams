import java.util.*;

class Lists {

   public static <T> List<T> toList(T... arr) {
     List<T> list = new ArrayList<T>();
     for (T elt : arr) 
       list.add(elt);
     return list;
   }

   public static <T> void addAll(List<T> list, T... arr) {
    for (T elt : arr) 
      list.add(elt);
   }

   static public void main(String[] args){
      List<Integer> ints = new ArrayList<Integer>();
      Lists.addAll(ints, 1, 2);
      Lists.addAll(ints, new Integer[] { 3, 4 });
      System.out.println(ints);
      assert ints.toString().equals("[1, 2, 3, 4]");
   }

}

