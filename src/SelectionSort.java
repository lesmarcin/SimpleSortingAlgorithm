public class SelectionSort {
    public static void SelectionSort(int[] array) {
        for (int i=0; i<array.length; i++) {
            int min = i;
            for (int j=i+1; j<array.length; j++) {
                if (array[min] < array[j]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
