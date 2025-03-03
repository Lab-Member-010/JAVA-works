import java.util.function.Function;

public class test7 {
    public static void main(String[] args) {
        Function<String,String> f=n->n.toUpperCase();
        System.out.println(f.apply("hello"));
    }
}