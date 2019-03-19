class FindDuplicates{

    private int findDuplicates(int[] arr){
        int slow =arr[0];
        int fast =arr[arr[0]];
        while (fast != slow){
            slow = arr[slow];
            fast = arr[arr[fast]];
        }
        fast =0;
        while(fast != slow){
            slow =  arr[slow];
            fast =  arr[fast];
        }
        return slow;
    }
    public static void main(String[] args){
        int [] array = {1,3,2,5,4,2};
        FindDuplicates findduplicates = new FindDuplicates();
        System.out.println("Duplicate number is : "+findduplicates.findDuplicates(array));

    }
}