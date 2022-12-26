public class BinarySearch {

    public boolean sequentialSearch(Integer val, Integer[] arr) {
        for (int i=0; i < arr.length; i++) {
            if (arr[i] == val) {
                return true;
            }
        }
        return false;
    }

    public boolean binarySearch(Integer val, Integer[] arr) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int m = left + (right - left) / 2;
            if (arr[m] == val) {
                return true;
            } else if (arr[m] < val) {
                left = m + 1;
            } else
                right = m - 1;
        }
        return false;
    }
}