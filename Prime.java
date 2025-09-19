import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isPrime (int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers ");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("The numbers entered that are prime numbers are: ");
        boolean FoundPrime = false;

        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.println(number);
                FoundPrime = true;
            }
        }
        if (!FoundPrime) {
            System.out.println("There is no prime number");
        }
    }

}