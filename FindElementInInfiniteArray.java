public class FindElementInInfiniteArray {
    public static void main(String[] args) {
        // basically array is infinite means we can not use the length function
        // now how can we get the end
        // we simeply take firest and second element of the array and check if the
        // element lie in that range if yes we pass that start and end as in the bunary
        // search function and if we do not find element in that range we simply have to
        // duble the range means update our end and start
        // for emple if we have s = 0 , e = 1 in the start that it will go like

        int[] arr = { 3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170 };

        int start = 0, end = 1;
        int target = 10;
        while (arr[end] < target) {
            int temp = start;

            end = end + (((end - start) + 1) * 2);

            start = temp + 1;
        }

        System.out.println(binarySearch(arr, start, end, target));
    }

    private static int binarySearch(int[] arr, int s, int e, int target) {
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
        return -1;
    }
}
