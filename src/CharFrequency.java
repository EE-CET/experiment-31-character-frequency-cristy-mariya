import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read full string (including spaces)
        String str = sc.nextLine();

        // Read character
        char ch = sc.next().charAt(0);

        int count = 0;

        // Count occurrences
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        // Output
        System.out.println(count);

        sc.close();
    }
}
