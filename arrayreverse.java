import java.util.*;
public class arrayreverse {
    public static void main(String[] args){
        int[] arr= {10,20,30,40,50};
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
    
            start++;
            end--;
        }
        System.out.println("reverse an array:"+ Arrays.toString(arr));
    }

    
}
