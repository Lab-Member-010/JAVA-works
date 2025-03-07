import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class test15 {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(110);
        l1.add(111);
        l1.add(112);
        l1.add(103);
        l1.add(104);
        l1.add(115);

        List<Integer> l2=l1.stream().filter(x->x%2==0).map(x->x+10).sorted().collect(Collectors.toList());
        System.out.println(l2);
    }
}