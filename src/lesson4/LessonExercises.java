package lesson4;

import java.util.Scanner;

public class LessonExercises {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        // #region Exercise 1
        for (char ch : s.toCharArray()) {
            if (ch < 97 || ch > 122) {
                result.append(ch);
                continue;
            }

            result.append((char) (ch - 32));
        }

        System.out.println(result);
        // #endregion

        // Exercise 2
        System.out.printf("Contains 'O': %b", result.toString().contains("O"));

        // Exercise 3
        char userChar = scanner.next().charAt(0);
        System.out.printf("The code is %d\n", (int) userChar);

        // Exercise 4
        StringBuilder exc4 = new StringBuilder();
        exc4.append("Java ");
        exc4.append("is ");
        exc4.append("fun!");
        System.out.println(exc4);

        // Exercise 5
        String str = scanner.nextLine();
        System.out.println(str.replace(" ", ""));
    }
}
