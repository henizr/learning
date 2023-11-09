package learning._java._alg;

import java.util.Arrays;

public class Program {
public static void main(String[] args) {
    int[] array = new int[] {8, 5, 3, 1};
    insSort(array);
    System.out.println(Arrays.toString(array));
}
    

public static void insSort(int[] arr){
    for(int partIndex = 1; partIndex < arr.length; partIndex++){
        int curUnsorted = arr[partIndex];
        int i  = 0;

        for(i = partIndex; i > 0 && arr[i - 1] > curUnsorted; i--){
            arr[i] = arr[i - 1];
            System.out.println(Arrays.toString(arr));
        }

        arr[i] = curUnsorted;
        
    }
}
}