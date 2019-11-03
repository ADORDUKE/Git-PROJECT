import java.util.Scanner;
import java.util.Scanner.*;
public class Fibonacci {
    public static void main(String[]args){
        int i = 0;
        int c;
        System.out.print("Введите число N: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.print("Числа Фибоначчи: ");
        for (c = 1; c <= input; c++)
        {
            System.out.print(Fibonacci(i)+"\t");
            i++;
        }

    }
    public static int Fibonacci(int input){
        if (input == 0)
            return 0;
        else if (input == 1)
            return 1;
        else
            return (Fibonacci(input - 1) + Fibonacci(input - 2));
    }

}
