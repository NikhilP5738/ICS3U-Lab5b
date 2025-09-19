import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[8];
        int passed = 0;
        int failed = 0;
        System.out.println("Enter the marks of 8 students ");
        for (int i = 0; i < 8; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("Results: ");
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > 50) {
                System.out.println("Passed!");
                passed++;
            } else {
                System.out.println("Failed!");
                failed++;
            }
        }
        System.out.println("Summary results: ");
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
    }

}
