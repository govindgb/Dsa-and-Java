
/**
 * BinarySearch
 */

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        // why use -> we use this to search fast
        // let suppose a book in which we have to seach any page let suppose the number
        // of page that book have 1000 and we have to seach 375 so firest we check is
        // this number that we have to search is grater or less than target than we
        // disscart the half part that the process is continue
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number that you want to search :->");
        int target = scanner.nextInt();
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };

        int start = 0, end = arr.length - 1;
        System.out.println(binarySearch(arr, start, end, target));

    }

    private static int binarySearch(int[] arr, int s, int e, int target) {
        // modify the function so it can return floor and ceil of a number
        // in the binary the s in smaller than e in the start so if the target in not in
        // the array in the s is pointing to the just bigger element than the target and
        // same e is pointing to just a smaller element than the target
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;

            }
        }
        // for floor
        // return e;
        // for ceil
        // return s;

        // if not element is found
        return -1;
    }

}