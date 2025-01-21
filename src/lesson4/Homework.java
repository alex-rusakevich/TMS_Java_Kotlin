package lesson4;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // #region Exercise 1
        System.out.print("Enter your string: ");
        String strIn = scanner.nextLine();

        System.out.print("Reversed: ");
        System.out.println(
                new StringBuilder(strIn).reverse()
        );
        // #endregion

        // #region Exercise 2
        StringBuilder asciiSequence = new StringBuilder();

        for (char ch : strIn.toCharArray()) {
            asciiSequence.append("0x").append(Integer.toHexString(ch)).append(" ");
        }

        String asciiStr = asciiSequence.substring(0, asciiSequence.length() - 1); // Chomp the space at the end
        System.out.printf("As an ASCII sequence: %s\n", asciiStr);

        StringBuilder stringIsBack = new StringBuilder();

        for (String hex : asciiStr.split(" ")) {
            stringIsBack.append(
                    (char) Integer.parseInt(hex.substring(2), 16)
            );
        }

        System.out.printf("Guess who's back? %s!\n", stringIsBack);
        // #endregion
    }
}
