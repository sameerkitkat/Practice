class SearchinSortedRotatedArray{

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

    private int findPivot(int[] arr,int left,int right){
        while(left<=right){
            int mid = (left+right)/2;
            if (arr[mid]>arr[mid+1]){
                return mid+1;
            }
            if(arr[left]<=arr[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }


    public static void main(String[] args){
        int [] array = {4,5,6,7,1,2,3};
        int number = 7;
        int left = 0, right = array.length-1;
        int mid = (left+right)/2;
        SearchinSortedRotatedArray searchinsortedroatedarray = new SearchinSortedRotatedArray();
        int pivot = searchinsortedroatedarray.findPivot(array, left, right);
        if (pivot<mid){
            int index = searchinsortedroatedarray.binarySearch(array, number, pivot, right);
            System.out.println(index);
        }
        else{
            int index = searchinsortedroatedarray.binarySearch(array, number, left, pivot);
            System.out.println(index);
        }
    }
}