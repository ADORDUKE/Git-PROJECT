import java.util.Scanner;
import java.util.Scanner.*;

public class NOKandNOD{
        // Recursive function to return gcd of a and b
        static int gcd(int a, int b)
        {
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }
    static int lcm(int a, int b)
    {
        return (a*b)/gcd(a, b);
    }

    // Driver method
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число a: ");
            int a = in.nextInt();
            System.out.print("Введите число b: ");
            int b = in.nextInt();
            System.out.println("НОД " + a +" и " + b + " равен " + gcd(a, b));
            System.out.println("НОК " + a +" и " + b + " равен " + lcm(a, b));
        }

    }

