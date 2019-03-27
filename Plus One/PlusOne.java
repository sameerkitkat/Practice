class PlusOne{

    private int[] plusOne(int[] arr){
        for (int i=arr.length-1;i>0;i--){
            if (arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        int [] newarr = new int[arr.length+1];
        newarr[0]=1;
        return newarr;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3};
        PlusOne plusone = new PlusOne();
        int[] newarr = plusone.plusOne(arr);
        for(int i=0;i<newarr.length;i++){
            System.out.println(newarr[i]);
        }
    }
}