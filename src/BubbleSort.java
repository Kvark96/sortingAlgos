public class BubbleSort {
    public static int[] sort(int[] arr){
        int tempVal;
        boolean swapped = true;
        int sortedVals = 0;
        while(swapped){
            for(int i = 0; i < arr.length - sortedVals; i++){
                for(int j = 0; j < arr.length - (sortedVals + 1); j++){
                    if(arr[j] > arr[j + 1]){
                        tempVal = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tempVal;
                        swapped = true;
                    } else {
                        swapped = false;
                    }
                }

            }
        }

        return arr;
    }
}
