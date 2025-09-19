import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double AverageTemperature(int [] temperatures) {
        int sum = 0;
        for (int temperature : temperatures) {
            sum += temperature;
        }
        double average = sum / temperatures.length;
        return average;
    }


    public static int FindHighest(int[] temperatures) {
        int highest = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > highest) {
                highest = temperatures[i];
            }
        }
        return highest;
    }

    public static int FindLowest(int[] temperatures) {
        int lowest = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] < lowest) {
                lowest = temperatures[i];
            }
        }
        return lowest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] temperatures = new int[7];
        System.out.println("Enter the temperatures for one week");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Day:" + (i + 1));
            temperatures[i] = input.nextInt();
        }

        double temperature = AverageTemperature(temperatures);
        double highest = FindHighest(temperatures);
        double lowest = FindLowest(temperatures);
        System.out.println("The Weekly Weather Report");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Day:" + (i + 1) + ": " + temperatures[i] +"C°");
        }
        System.out.println("The average temperature is " + temperature);
        System.out.println("The highest temperature is " + highest + "C°");
        System.out.println("The lowest temperature is " + lowest + "C°");
    }
}

