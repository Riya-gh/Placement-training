import java.util.*;
 public class range
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number ");
        int a = sc.nextInt();

        if (a>=10 && a<=100)
        {
            System.out.println("Within range");
        }
        else{
             System.out.println("Out of range");
        }
        sc.close();
    }
}