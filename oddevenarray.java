import java.util.*;
public class oddevenarray {
    public static void main(String[] args){
        int[] arr = {1,3,2,4,6,8,9,11};
        int even =0; 
        int odd = 0;
        for (int num : arr){
            if(num%2 == 0){
                even ++;
            }
            else{
                odd++;
            }
        }
        System.out.println("even numbers:"+even);
        System.out.println("odd numbers:"+odd);
    }
}

