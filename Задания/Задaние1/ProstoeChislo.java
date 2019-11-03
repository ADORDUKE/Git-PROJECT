import java.util.Scanner;

public class ProstoeChislo {
    public static void main (String args[]) {
        System.out.print("Введите число N: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        for (int n = 1; n<=input; n++) {
            boolean isPrime=true;
            for (int i = 2; i < n; i++) {
                if ((n % i) == 0) {
                    isPrime = false;
                }
            }
            if (isPrime){
                System.out.println(n + " Простое");
            }
            else {
                System.out.print("");
            }
        }
    }
}
