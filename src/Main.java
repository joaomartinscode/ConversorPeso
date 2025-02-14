import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("WEIGHT CONVERSION PROGRAM");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");

        System.out.println("Choose your choice: ");
        choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter weight in lbs: ");
                    weight = scanner.nextDouble();
                    newWeight = weight * 0.453592;
                    System.out.print("New weight in kgs:" + newWeight);
                    break;
                case 2:
                    System.out.print("Enter weight in kgs: ");
                    weight = scanner.nextDouble();
                    newWeight = weight * 2.20462;
                    System.out.print("New weight in lbs: " + newWeight);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        scanner.close();
    }
}