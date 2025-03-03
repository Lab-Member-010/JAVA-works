import java.util.function.Function;

public class test8 {
    public static void main(String[] args) {
        Function<String,Integer> f=n->n.length();
        System.out.println(f.apply("hello"));
    }
}