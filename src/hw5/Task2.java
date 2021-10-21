package hw5;

public class Task2 {
    private static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();

    }

    public static void main(String[] args) {
        System.out.println(reverseString("man has dog"));
    }
}
