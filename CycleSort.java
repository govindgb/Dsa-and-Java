import java.util.*;

public class CycleSort {
    public static void main(String[] args) {
        // this is the sort use to sort the array if they have element 1 to n or 0 to
        // n-1
        // its time complexcity is o(n)
        // it is pattern that help to sole any quetion that have a range of element is 1
        // to n or 0 to n-1

        // take a array
        int[] arr = { 3, 5, 2, 1, 4 };
        int n = arr.length;

        int i = 0;

        while (i < n) {
            // we know that our current array element is belongs to 1 to n
            // the relation between the element of array and there index are || index =
            // arr[i] - 1 ||
            int ele = arr[i];
            if (ele - 1 != i) {
                // swap the element to it orignal index that belogs to
                int temp = arr[ele - 1];
                arr[ele - 1] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
