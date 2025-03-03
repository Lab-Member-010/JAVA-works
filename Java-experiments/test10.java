import java.util.function.Consumer;

public class test10 {
    public static void main(String[] args) {
        Consumer<String> c=s->System.out.println(s);
        c.accept("welcome");
    }
}
