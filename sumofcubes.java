import java.util.*;
 public class sumofcubes
 {
   public static void main(String[] args)
   {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter m");
    int m = sc.nextInt();
    System.out.println("Enter n");
    int n = sc.nextInt();
    
    if (m>n)
    {
        System.out.println("0");
    }
    else
    {
        int sum = 0;
        for (int i=m; i<=n; i++)
        {
         int cube = i*i*i;
          sum += cube;
        }
         System.out.println("sum of cubes " + sum);
    }
    sc.close();
   }
 }