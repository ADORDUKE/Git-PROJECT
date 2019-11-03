import java.util.*;

public class Palindrome {
    public static void main(String args[])
    {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Слово палиндромное.");
        else
            System.out.println("Слово не палиндропное.");
    }
}
