public class Main {
    public static void main(String[] args) {
        //Array to sort
        int[] arrayToSort = {2, 7, 5, 9, 3};

        for (int x : arrayToSort) {
            System.out.print(x + " ");
        }
        System.out.println();

        //BubbleSort
        BubbleSort.BubbleSort(arrayToSort);
        for (int y : arrayToSort) {
            System.out.print(y + " ");
        }
        System.out.println();

        //SelectionSort
        SelectionSort.SelectionSort(arrayToSort);
        for (int z : arrayToSort) {
            System.out.print(z + " ");
        }
        System.out.println();

        //InsertionSort
        InsertionSort.InsertionSort(arrayToSort);
        for (int a : arrayToSort) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}