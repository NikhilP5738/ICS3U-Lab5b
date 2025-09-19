import java.util.Scanner;

public class Main {
    public static double CalculateAverage(int[] marks) {
        int sum = 0;
        for (int mark: marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
    public static int findHighest(int[] marks) {
        int highest = marks[0];
        for (int mark : marks) {
            if (highest < mark) {
                highest = mark;
            }
        }
        return highest;
    }
    public static int findLowest(int[] marks) {
        int lowest = marks[0];
        for (int mark : marks) {
            if (lowest > mark) {
                lowest = mark;
            }
        }
        return lowest;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[10];

        System.out.println("Enter the marks of 10 students ");
        for (int i = 0; i < 10; i++) {
            marks[i] = scanner.nextInt();
        }
        double average = CalculateAverage(marks);
        int highest = findHighest(marks);
        int lowest = findLowest(marks);
        System.out.println("Average marks is " + average);
        System.out.println("Highest mark is " + highest);
        System.out.println("Lowest mark is " + lowest);

    }
}
