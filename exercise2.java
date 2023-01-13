import java.util.Scanner;
public class App {
    static Scanner scan = new Scanner (System.in);
    public static void main(String[] args) throws Exception {
        
        drive("skills");
        scan.close();
    }

    static void drive(String skills) {

        System.out.println("Training!");
        train(skills);

        String feedback = getFeedBack(skills);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            morePractice(skills);

            // Recursive call
            drive(skills);
        } else if (feedback.equals("yes")) {
            show(skills);
        }
    }

    static void train(String skill) {
        System.out.println("Driving Skills");
    }

    static String getFeedBack(String food) {
        System.out.println("Is the " + "driving skill" + " satisfactory? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void morePractice(String food) {
        System.out.print("Enter additional skills:");
        String skill = scan.next();
        System.out.println("Fixing skills. Added " + skill);
    }

    static void show(String skills) {
        System.out.println("Training driving " + skills + " passed!");
    }
    
}

