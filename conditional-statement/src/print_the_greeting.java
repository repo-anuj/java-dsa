import java.util.Scanner;

public class print_the_greeting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x == 1) {
            System.out.println("Hello");
        } else if (x == 2) {
            System.out.println("namaste");
        } else if (x == 3) {
            System.out.println("bonjour");
        } else {
            System.out.println("invalid input");
        }
    }
}