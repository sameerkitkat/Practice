/*@author sameer
Date 18/02/2019 */

class RemoveDuplicates {

    private int removeDuplicates(int[] arr) {
        int j = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != arr[i+1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j] = arr[arr.length - 1];
        return j;
    }

    public static void main(String[] args) {
        int[] array = { 1, 1, 1, 2, 2, 3 ,3, 6,  6, 6};
        RemoveDuplicates removeduplicates = new RemoveDuplicates();
        int result_array = removeduplicates.removeDuplicates(array);
        for (int i = 0; i <= result_array; i++) {
            System.out.print(array[i]);
        }

    }
}
