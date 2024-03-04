import java.util.Arrays;

public class jq12{
    public static void main(String[] args) {
        int[] arry = {23, 34, 12, 101, 22, 11, 40};

        System.out.println("Original Array: " + Arrays.toString(arry));

        bubbleSort(arry);

        System.out.println("Sorted Array: " + Arrays.toString(arry));
    }

    // Static method to perform bubble sort
    public static void bubbleSort(int[] arry) {
        int n = arry.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arry[j] > arry[j + 1]) {
                    // Swap arry[j] and arry[j+1]
                    int temp = arry[j];
                    arry[j] = arry[j + 1];
                    arry[j + 1] = temp;
                }
            }
        }
    }
}
