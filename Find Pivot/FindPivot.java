class FindPivot{
    private int findPivot(int[] arr){
        int sum = 0,half = 0; 
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if (sum == half * 2 + arr[i]){
                return i;
            }
            half+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] array = {-1,-1,-1,-1,-1,0};
        FindPivot findpivot = new FindPivot();
        int index = findpivot.findPivot(array);
        System.out.println("Pivot index is "+index);
    }
}