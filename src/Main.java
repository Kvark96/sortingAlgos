public class Main {

    public static void main(String[] args) {
	    int[] input = {2, 7, 9, 15, 6, 3, 10, 14, 13, 1, 4, 5, 12, 8};
        printArr(input);

        System.out.println("\nBubbly:");
        printArr(BubbleSort.sort(new int[]{2, 7, 9, 15, 6, 3, 10, 14, 13, 1, 4, 5, 12, 8}));

        System.out.println("\nInsertion Sort: ");
        printArr(InsertionSort.sort(new int[]{2, 7, 9, 15, 6, 3, 10, 14, 13, 1, 4, 5, 12, 8}));

        System.out.println("\nSelection Sort: ");
        printArr(SelectionSort.sort(new int[]{2, 7, 9, 15, 6, 3, 10, 14, 13, 1, 4, 5, 12, 8}));

        System.out.println("\nFast as fuck sort: ");
        printArr(QuickSort.sort(new int[]{2, 7, 9, 15, 6, 3, 10, 14, 13, 1, 4, 5, 12, 8}));

    }

    public static void printArr(int[] arr){
        String str = "";
        for(int i : arr){
            str = str + i + ", ";
        }
        System.out.println(str);
    }
}
