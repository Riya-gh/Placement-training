import java.util.*;
public class mergearrays {
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9,10};
        int[] mergedarray = new int[arr1.length + arr2.length];
        for(int i=0; i<arr1.length; i++){
            mergedarray[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            mergedarray[arr1.length +i]=arr2[i];
        }
        System.out.println("merged array is:"+ Arrays.toString(mergedarray));
    }
}
