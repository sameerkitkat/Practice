
class MoveZeros{
    private void moveZeros (int[] arr){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        while(count<arr.length){
            arr[count]=0;
            count++;
        }
    }
    public static void main(String[] args) {
        int[] array = {0,1,0,3,12};
        MoveZeros movezeros = new MoveZeros();
        movezeros.moveZeros(array);
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}