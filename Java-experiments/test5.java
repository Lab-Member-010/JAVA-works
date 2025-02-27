import java.util.ArrayList;
import java.util.function.Predicate;

public class test5 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Hello@123");
        al.add("hello123");
        al.add("WELCOME!1");
        al.add("Test@99");
        al.add("Secure#2023");

        Predicate<String> p = y ->y.length() >= 8 &&
                y.matches(".*[A-Z].*") &&
                y.matches(".*[a-z].*") &&
                y.matches(".*\\d.*") &&
                y.matches(".*[!@#$%&*].*");
        ;

        for (String x : al) {
            if (p.test(x))
                System.out.println("Strong Password: " + x);
            else
                System.out.println("Weak Password: " + x);
        }
    }
}
