import java.util.function.Function;

public class test6 {
    public static void main(String[] args) {
        Function<Integer,Integer> f=n->n*n;
        System.out.println(f.apply(5));
    }
}