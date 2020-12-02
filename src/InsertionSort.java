public class InsertionSort {
    public static int[] sort(int[] arr){
        int holePosition, valueToInsert;
        for(int i = 0; i < arr.length; i++){
            valueToInsert = arr[i];
            holePosition = i;

            while(holePosition > 0 && arr[holePosition-1] > valueToInsert){
                arr[holePosition] = arr[holePosition-1];
                holePosition--;
            }

            arr[holePosition] = valueToInsert;
        }
        return arr;
    }
}
