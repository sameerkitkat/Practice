/*@author sameer
 date 17/02/2019*/

class TwoSum {

    /*
     * Method accepts given array and target returns result array
     */
    private int[] twoSum(int[] arr, int target) {
        int ans = 0;
        /* Declare result array */
        int[] ans_arr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            ans = target - arr[i];
            for (int j = 1; j < arr.length; j++) {
                if (ans == arr[j]) {
                    ans_arr[0] = arr[i];
                    ans_arr[1] = arr[j];
                }
            }
        }
        return ans_arr;
    }

    /* Main Function to drive program */
    public static void main(String[] args) {
        int[] arr = { 11, 7, 15, 2 };
        int target = 9;
        TwoSum twosum = new TwoSum();
        int res_arr[] = twosum.twoSum(arr, target);
        for (int i = 0; i < res_arr.length; i++) {
            System.out.print(res_arr[i] + " ");
        }
    }

}