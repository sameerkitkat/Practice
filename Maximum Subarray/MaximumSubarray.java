class MaximumSubarray{

    private int findMaximumSum(int[] arr){
        int current_max = arr[0], max_so_far=arr[0];
        for (int i=1;i<arr.length;i++){
          current_max = Math.max(arr[i], current_max+arr[i]);
          max_so_far = Math.max(max_so_far,current_max);
        }
        return max_so_far;
    }

    public static void main(String[] args){
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray maximumsubarray = new MaximumSubarray();
        int sum = maximumsubarray.findMaximumSum(array);
        System.out.println(sum);
    }
}