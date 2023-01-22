import java.util.Scanner;

public class assignment2 {

    static Scanner scan = new Scanner(System.in);
    static final int targetWeight = 166;

    public static void main(String[] args) throws Exception {

        System.out.print("Enter current weight in lbs: ");
        int weight = scan.nextInt();

        if (weight > 150) {
            loseWeight(weight);
        } else {
            System.out.println("Current weight must be greater than 150 lbs!");
        }
        scan.close();
    }

    static void loseWeight(int currentWeight) {

        System.out.println("Eating right!");
        System.out.println("Doing exercises!");

        currentWeight = checkWeight(currentWeight);

        if (checkWeight(currentWeight)<150) {
            fixDietandExercise(currentWeight);
            loseWeight(currentWeight);
        } else if (checkWeight(currentWeight)>=150) {
            System.out.println("I have reached my target weight");
        }

        // Define the base case by using an if condition. The target weight is 150 lbs
        // Do something to reach the target. Call the fixDietandExercise() method
        // Do the recursive call. Call the loseWeight() method
      
        // if the target weight has been reached, print the code below.
        // System.out.println("I have reached my target weight!");
           
    }

    static int checkWeight(int weight) {
        System.out.println("My current weight is: " + weight + "lbs");
        return weight;
    }

    static int fixDietandExercise(int weight) {

        System.out.println("Fixing Diet and Exercise!");
        System.out.print("Enter weight lost in lbs: ");
        int weightlost = scan.nextInt();

        int currentWeight = weight - weightlost;
        return currentWeight;
    }
}
