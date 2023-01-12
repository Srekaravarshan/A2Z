package step2_2;

public class Quicksort {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 2, 5, 8, 2, 9, 1, 7, 3, 4 };
        quicksort(arr, 0, arr.length - 1);
        System.out.println(arr);
    }

    public static void quicksort(int[] arr, int left, int right) {
        if (left >= right)
            return;

        int pivot = arr[(left + right) / 2];

        int index = partition(arr, left, right, pivot);
        quicksort(arr, left, index-1);
        quicksort(arr, index, right);
    }

    public static int partition(int[] arr, int left, int right, int pivot) {
        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("\n" + left+""+pivot);
        return left;
    }

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
