import java.util.*;
public class loginsystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String username = "riyatirumala";
        String password = "1234";
        System.out.println("Enter the username");
        String a = sc.next();

        System.out.println("Enter the password");
        String b = sc.next();
        if (a.equals(username) && b.equals(password))
        {
            System.out.println("access granted");
        }
        else if (a.equals(username) && !b.equals(password)) {
            System.out.println("incorrect password");
        } else if (!a.equals(username) && b.equals(password)) {
            System.out.println("incorrect username");
        }
        else{
            System.out.println("access not granted");
        }
        sc.close();
    }
}