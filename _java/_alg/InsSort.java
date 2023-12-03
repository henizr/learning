import java.util.Arrays;

class Sorting {
    public static void main(String[] args) {
        int[] array = new int[] { 1000, 10, 100000, -90, 0, 100, 1 };
        insSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insSort(int[] arr) {
        for (int partIndex = 1; partIndex < arr.length; partIndex++) {
            int curUnsorted = arr[partIndex];
            int i = 0;

            for (i = partIndex; i > 0 && arr[i - 1] > curUnsorted; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = curUnsorted;
        }
    }
}