import java.util.*;

public class jq6 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        // Input array sizes
        System.out.print("Enter the size of the first array: ");
        int size1 = c.nextInt();
        System.out.print("Enter the size of the second array: ");
        int size2 = c.nextInt();

        // Input arrays
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = c.nextInt();
        }
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = c.nextInt();
        }

        // Find intersection
        int[] intersection = findIntersection(array1, array2);

        // Display the intersection
        System.out.println("Intersection of the two arrays:");
        System.out.println(Arrays.toString(intersection));

        c.close();
    }

    // Static method to find intersection of two arrays
    public static int[] findIntersection(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }

        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : array2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // Convert set to array
        int[] intersection = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            intersection[index++] = num;
        }

        return intersection;
    }
}
