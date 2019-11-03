import java.util.Scanner;

public class RegEx {

    public static void main(String[] args) {
        String str = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        str = in.nextLine();
        System.out.println("Текст без чисел: " + str.replaceAll("([0-9])", ""));
    }
}
