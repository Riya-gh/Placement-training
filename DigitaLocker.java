import java.util.*;
public class DigitaLocker {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the locker number:");
        int lockernumber = sc.nextInt();
        boolean isPrime = true;
         if(lockernumber <= 1) {
                isPrime = false;
            } else {
                for(int i = 2; i <= Math.sqrt(lockernumber); i++) {
                    if(lockernumber % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime)
             {
                System.out.println("Access granted");

             }
             else{
                    System.out.println("Access denied");
             }
        sc.close();
    }
    
}

