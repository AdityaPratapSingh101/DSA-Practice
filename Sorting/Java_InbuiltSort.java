package Sorting;
import java.util.Arrays;
public class Java_InbuiltSort {
    public static void main(String[] args) {
        int arr[]={64, 25, 12, 22, 11};
        Arrays.sort(arr); // inbuilt sorting method
        System.out.println("Sorted array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
