public class QuickSort {
    public static int[] sort(int[] arr){
        int right = arr.length-1;
        quickSort(0, right, arr);

        return arr;
    }

    private static void quickSort(int left, int right, int[] arr){
        if(!(right-left <= 0)){
            quickSort(left, partition(left, right, arr) - 1, arr);
            quickSort(partition(left, right, arr), right, arr);
        }
    }

    private static int partition(int left, int right, int[] arr){
        int pivot = arr[right];
        boolean finished = false;

        while(!finished){
            while(arr[left] < pivot) left++;
            while(arr[right] > pivot) right--;
            if(left >= right) {
                finished = true;
            } else {
                int tempVal = arr[left];
                arr[left] = arr[right];
                arr[right] = tempVal;
            }
        }
        return left;
    }

}
