package Arrays;

public class LargestArray {
    public static int largest(int [] arr){
        int Largest = Integer.MIN_VALUE;// initially set to smallest possible value
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > Largest){
                Largest = arr[i];
            }
        }
        return Largest; 
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 8, 4, 5};
        int result = largest(arr);
        System.out.println("Largest element in the array is: " + result);
    }
    
}
