class RotateArray {
    private void reverseArray(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
    }
    private void rotateArray(int[] arr, int k){
        reverseArray(arr, 0, arr.length-1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int n=3;
        RotateArray rotatearray = new RotateArray();
        rotatearray.rotateArray(arr,n);
    }
}