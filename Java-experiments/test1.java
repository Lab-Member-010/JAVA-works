import java.util.*;

// class Innertest1 implements Comparator<Integer>{
//     @Override
//     public int compare(Integer o1, Integer o2) {
//         // TODO Auto-generated method stub
//         return -o1.compareTo(o2);
//     }
// }

// public class test1 {
//     public static void main(String[] args) {
//         Map m=new TreeMap(new Innertest1());
//         m.put(4,"apple");
//         m.put(3,"ball");
//         m.put(2,"cat");
//         m.put(1,"dog");

//         System.out.println(m);
//     }
// }

public class test1 {
    public static void main(String[] args) {
        PriorityQueue<String> p=new PriorityQueue<String>();
        p.offer("apple");
        p.offer("ball");
        p.offer("apple2");

        System.out.println(p);
    }
}