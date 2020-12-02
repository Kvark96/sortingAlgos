public class SelectionSort {
    public static int[] sort(int[] arr) {
        int tempVal;
        for(int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] < arr[j]) {
                    tempVal = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempVal;
                }
            }
        }

        return arr;
    }
}
