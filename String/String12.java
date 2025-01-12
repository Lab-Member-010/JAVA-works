public class String12{
    public static void main(String[] args) {
        String input = "67, 89, 23, 67, 12, 55, 66";
        String numbers[] = input.replaceAll("\\s", "").split(",");
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        System.out.println("Sum of all integers: " + sum);
    }
}
