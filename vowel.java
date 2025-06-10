import java.util.*;
public class vowel {
    public static void main(String[] args)
        {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the letter");
    char input = sc.next().toLowerCase().charAt(0);
    if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u')
    {
     System.out.println("vowel");   
    }
    else
    {
        System.out.println("Not vowel");
    }
    sc.close();
    }
}
