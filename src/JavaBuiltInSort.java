import java.util.Collections;
import static java.util.Arrays.sort;


public class JavaBuiltInSort {

    /* Prints the array */
    void printArray(Integer arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println();
    }

    void printArray(String arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println(arr[i]);
        System.out.println();
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[])
    {
        JavaBuiltInSort ob = new JavaBuiltInSort();

        /*

        Integer arr[] = {64, 34, 25, 12, 22, 90, 11};
        System.out.println("The Unsorted array is");
        ob.printArray(arr);

        sort(arr, 3, 7);
        System.out.println("The Java Built In Sort of the last 4 elements is");
        ob.printArray(arr);

        sort(arr);
        System.out.println("The Java Built In Sorted array is");
        ob.printArray(arr);

        sort(arr, Collections.reverseOrder());
        System.out.println("The Java Built in Reverse Sorted array is");
        ob.printArray(arr);

         */

        String arr[] = {
                "Michael",
                "Tamara",
                "Mackenzie",
                "Caius",
                "Emilia",
                "Katie",
                "Michael",
                "Maggie",
                "Austin"
        };

        System.out.println("The Unsorted array is");
        ob.printArray(arr);

        sort(arr);
        System.out.println("The Java Built In Sorted array is");
        ob.printArray(arr);

        sort(arr, Collections.reverseOrder());
        System.out.println("The Java Built in Reverse Sorted array is");
        ob.printArray(arr);

        sort(arr, arr.length-4, arr.length);
        System.out.println("The Java Built in Sort of the last 4 elements is");
        ob.printArray(arr);
    }

}
