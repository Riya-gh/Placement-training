import java.util.*;
public class arrayequal {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {10, 20, 30, 40, 50};

      boolean areequal = Arrays.equals(arr1,arr2);
      if (areequal)
{
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
        }
}      