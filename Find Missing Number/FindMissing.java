class FindMissing{
    private int findMissing(int[] arr){
        int n = arr.length;
        int sum = 0;
        int arthsum = (n*(n+1))/2; 
        for (int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        return (arthsum-sum);
    }
    public static void main(String[] args) {
        int[] array = {0,2,3,1,7,6,5};        
        FindMissing findmissing = new FindMissing();
        int missing_number = findmissing.findMissing(array);
        System.out.println("Missing number is :"+missing_number);
    }
}