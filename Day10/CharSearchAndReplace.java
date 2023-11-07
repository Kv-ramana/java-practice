import java.util.Scanner;

public class CharSearchAndReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input paragraph: ");
        String inputParagraph = scanner.nextLine();

        System.out.print("Enter the character to search for: ");
        char searchChar = scanner.next().charAt(0);

        System.out.print("Enter the character to replace with: ");
        char replaceChar = scanner.next().charAt(0);

        String result = searchAndReplace(inputParagraph, searchChar, replaceChar);

        System.out.println("Modified paragraph: " + result);

        scanner.close();
    }

    public static String searchAndReplace(String input, char searchChar, char replaceChar) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        char[] inputChars = input.toCharArray();
        for (int i = 0; i < inputChars.length; i++) {
            if (inputChars[i] == searchChar) {
                inputChars[i] = replaceChar;
            }
        }

        return new String(inputChars);
    }
}
