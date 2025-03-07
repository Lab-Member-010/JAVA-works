import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class test13 {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(11);
        l1.add(12);
        l1.add(13);
        l1.add(14);
        l1.add(15);

        List<Integer> l2=l1.stream().filter(x->x%2==1).collect(Collectors.toList());
        System.out.println(l2);
    }
}