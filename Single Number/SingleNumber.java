class SingleNumber{
    private int findSingleNumber(int[] arr){
        for (int i=1;i<arr.length;i++){
            arr[0] = arr[0] ^ arr[i];
        }
    return arr[0];
}
    public static void main(String[] args){
        int[] array = {2,2,1};
        SingleNumber singlenumber = new SingleNumber();
        int number = singlenumber.findSingleNumber(array);
        System.out.println("Single number is "+number);
    }
}