 import java.util.*;
 public class array{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int [] a =  new int[5];
    System.out.println("enter the elements");
     for (int i=0; i<a.length; i++)
     {
         a[i] = sc.nextInt();
     }
     sc.close();
   }
}