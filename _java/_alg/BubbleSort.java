
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        
        int array[] = new int[]{10, 10, 1, -90, 80};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void bubbleSort(int[] arr){
        boolean swapped = true;

        while (swapped) {
            swapped = false;

            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    swapped = true;
                }
            }
        }
    }
}
