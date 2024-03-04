
import java.util.Arrays;

public class jq18 {
    public static void main(String[] args) {
        // Example arrays
        int[] array1 = {20, 2, 3,26};
        int[] array2 = {19, 5, 6,88};
        
        // Concatenate arrays
        int[] arryconcat = concatarry(array1, array2);
        
        // Print the concatenated array
        System.out.println("Concatenated Array: " + Arrays.toString(arryconcat));
    }
    
    // Static method to concatenate two arrays
    public static int[] concatarry(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        
        // Create a new array to hold the concatenated elements
        int[] arryconcat = new int[length1 + length2];
        
        // Copy elements of array1 to arryconcat
        for (int i = 0; i < length1; i++) {
            arryconcat[i] = array1[i];
        }
        
        // Copy elements of array2 to arryconcat
        for (int i = 0; i < length2; i++) {
            arryconcat[length1 + i] = array2[i];
        }
        
        return arryconcat;
    }
}
