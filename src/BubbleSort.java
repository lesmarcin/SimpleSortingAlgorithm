public class BubbleSort {
    public static void BubbleSort(int[] array) {
        for (int i = 0; i<array.length; i++) {
            for (int j = i+1; j<array.length; j++) {
                int temp;
                if (array[j] < array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
