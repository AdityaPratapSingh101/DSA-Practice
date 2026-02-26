package Sorting;
/* insertion Sort Working 
1. We start from the second element (index 1) and compare it with the elements before it.
2. If the current element (key) is smaller than the compared element, we shift the compared element one position to the right.
3. We repeat this process until we find the correct position for the key, and then we insert the key at that position.
4. We continue this process for all elements in the array until the entire array is sorted.         
 */
public class InsertionSort {
    public static void insertionSorting(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int arr[]={12, 11, 13, 5, 6};
        insertionSorting(arr);
        System.out.println("Sorted array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
