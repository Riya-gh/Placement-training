import java.util.Scanner;

public class Main {
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  
        int result = factorial(num); 
        System.out.println(result); 
    }
}