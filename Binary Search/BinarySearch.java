class BinarySearch {

    private int binarySearch(int[] array, int number, int left, int right) {
        while (left <= right) {
            int mid = (right + left) / 2;
            if (array[mid] == number) {
                return mid;
            } else if (array[mid] > number) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int number = 10;
        int left = 0, right = (array.length - 1);
        BinarySearch binarysearch = new BinarySearch();
        int index = binarysearch.binarySearch(array, number, left, right);
        System.out.print(index);

    }
}