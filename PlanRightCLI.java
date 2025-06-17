import java.util.Scanner;

public class PlanRightCLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to PlanRight CLI Version");
        System.out.print("Enter grade (0 for R, 1-7): ");
        int grade = scanner.nextInt();
        scanner.nextLine();  // consume newline

        System.out.print("Enter subject: ");
        String subject = scanner.nextLine();

        System.out.print("Enter week: ");
        String week = scanner.nextLine();

        int maxObjectives = grade <= 5 ? 1 : 2;
        String[] objectives = new String[maxObjectives];

        for (int i = 0; i < maxObjectives; i++) {
            System.out.print("Enter objective " + (i + 1) + ": ");
            objectives[i] = scanner.nextLine();
        }

        System.out.println("\nDifferentiation:");
        String[] levels = { "Emerging", "Developing", "Mastery" };
        String[] differentiation = new String[3];

        for (int i = 0; i < levels.length; i++) {
            System.out.print("Objective for " + levels[i] + ": ");
            differentiation[i] = scanner.nextLine();
        }

        System.out.println("\nLesson Plan Summary:");
        System.out.println("Grade: " + grade);
        System.out.println("Subject: " + subject);
        System.out.println("Week: " + week);
        for (String obj : objectives) {
            System.out.println(" - " + obj);
        }
        for (int i = 0; i < levels.length; i++) {
            System.out.println(" " + levels[i] + ": " + differentiation[i]);
        }
    }
}
