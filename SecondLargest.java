import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers: ");
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        int largest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        System.out.println("The largest number is " + largest);
        int secondLargest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums.length < largest) {
                secondLargest = nums[i];
            }
        }
        System.out.println("The second largest number is " + secondLargest);





    }
    }
