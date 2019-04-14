class BinarySearchMatrix {

    private boolean binarySearch(int[][] matrix, int n, int x) {
        int i = 0;
        int j = n - 1;
        while (i < n && j > 0) {
            if (matrix[i][j] == x) {
                System.out.println("Element found at " + i + "," + j);
                return true;
            } else if (matrix[i][j] < x) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 4, 7, }, { 2, 5, 8 }, { 3, 6, 9 } };
        BinarySearchMatrix binarysearchmatrix = new BinarySearchMatrix();
        System.out.println(binarysearchmatrix.binarySearch(matrix, 3, 5));
    }
}