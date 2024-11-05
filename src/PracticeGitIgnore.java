
    import java.util.Scanner;
    public class PracticeGitIgnore {
        public static void main(String[] args) {
            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);

            // Ask the user for the first string
            System.out.print("Enter the first string: ok ");
            String str1 = scanner.nextLine();

            // Ask the user for the second string
            System.out.print("Enter the second string: ok ");
            String str2 = scanner.nextLine();

            // Concatenate the strings
            String result = str1 + str2;

            // Display the concatenated result
            System.out.println("The concatenated string is: ok " + result);

            // Close the scanner
            scanner.close();
        }
    }
