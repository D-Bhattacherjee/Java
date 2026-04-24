// write a method to find the largestElement in the given array

public class flie4 {
    public static int largestElement(int[] array) {
        int largestElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (largestElement < array[i]) {
                largestElement = array[i];
            }
        }
        return largestElement;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 83, 45, 66, 37, 28, 21 };

        int max = largestElement(arr);

        System.out.println(max);
    }
}
