import java.util.Scanner;

public class OnlineExaminationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password;

        // Login
        System.out.println("=== Online Examination System ===");
        System.out.println("Please login to proceed:");
        System.out.print("Username: ");
        username = scanner.nextLine();
        System.out.print("Password: ");
        password = scanner.nextLine();

        if (authenticateUser(username, password)) {
            System.out.println("Login successful!\n");

            // Update Profile and Password
            updateProfile(username);
            updatePassword(username);

            // Selecting answers for MCQs
            System.out.println("=== MCQ Section ===");
            boolean isSubmitted = selectAnswers();

            // Timer and auto submit
            System.out.println("=== Timer and Auto Submit ===");
            startTimer(10); // 10 seconds countdown
            if (!isSubmitted) {
                autoSubmit();
            }

            // Closing session and Logout
            System.out.println("=== Closing Session and Logout ===");
            closeSession(username);
            logout();
        } else {
            System.out.println("Login failed. Please try again.");
        }

        scanner.close();
    }

    public static boolean authenticateUser(String username, String password) {
        // Replace this with your actual authentication logic
        // For simplicity, let's assume a hardcoded valid username and password
        String validUsername = "admin";
        String validPassword = "admin123";
        return username.equals(validUsername) && password.equals(validPassword);
    }

    public static void updateProfile(String username) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Updating profile for user: " + username);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();
        // Add your profile update logic here
        // You can save the updated profile details to a database or file
        System.out.println("Profile updated successfully!\n");
    }

    public static void updatePassword(String username) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Updating password for user: " + username);
        System.out.print("Enter your current password: ");
        String currentPassword = scanner.nextLine();
        System.out.print("Enter your new password: ");
        String newPassword = scanner.nextLine();
        // Add your password update logic here
        // You can update the password in a database or file
        System.out.println("Password updated successfully!\n");
    }

    public static boolean selectAnswers() {
        Scanner scanner = new Scanner(System.in);
        // Add your MCQ selection logic here
        // Prompt the user to select answers for the MCQs
        System.out.println("Select the correct option for each question (A, B, C, or D):");
        System.out.println("1. What is the capital of France?");
        System.out.println("   A) Paris");
        System.out.println("   B) London");
        System.out.println("   C) Berlin");
        System.out.println("   D) Madrid");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine();

        System.out.println("2. Which planet is known as the Red Planet?");
        System.out.println("   A) Mars");
        System.out.println("   B) Jupiter");
        System.out.println("   C) Venus");
        System.out.println("   D) Saturn");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine();

        // Add more questions and answers as needed

        // After receiving all answers, you can evaluate the score and provide feedback to the user
        // You can save the answers and evaluate them later
        System.out.println("Answers submitted!\n");

        // Returning true to indicate that the answers were submitted
        return true;
    }

    public static void startTimer(int seconds) {
        // Add your timer logic here
        System.out.println("Timer started for 10 seconds.\n");
        try {
            Thread.sleep(seconds * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void autoSubmit() {
        // Add your auto-submit logic here
        System.out.println("Time's up! Automatically submitting the answers.\n");
    }

    public static void closeSession(String username) {
        // Add your session closing logic here
        System.out.println("Closing session for user: " + username + "\n");
    }

    public static void logout() {
        System.out.println("Logout successful. Thank you!");
        // Add your logout logic here
    }
}
