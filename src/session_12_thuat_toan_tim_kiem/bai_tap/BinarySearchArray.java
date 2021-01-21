package session_12_thuat_toan_tim_kiem.bai_tap;

public class BinarySearchArray {
    public int binarySearch(int[] arr, int low, int high, int x) {
        int mid = (low + high) / 2;
        if (high < low) {
            return -1;
        } else {
            if (arr[mid] == x) {
                return mid;

            } else if (x < arr[mid]) {
                return binarySearch(arr, low, mid - 1, x);

            } else {
                return binarySearch(arr, mid + 1, high, x);
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 15, 19, 40, 75, 79};
        BinarySearchArray ob = new BinarySearchArray();
        int x = 40;
        int n = arr.length;
        int result = ob.binarySearch(arr, 0, n-1, x);
        if (result == -1) {
            System.out.println(x + " khong co trong mang");
        } else {
            System.out.println("vi tri cua: " + x + " là: " + result);
        }
    }
}
