class RemoveElement {
    
    private int removeElement(int[] arr, int num) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] array = { 3, 2, 2, 3, 4, 5 };
        RemoveElement removeelement = new RemoveElement();
        int n = removeelement.removeElement(array, 3);
        System.out.println("Length of array is " + n);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}