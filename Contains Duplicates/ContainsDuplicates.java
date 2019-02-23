import java.util.HashSet;
import java.util.Set;

class ContainsDuplicates{
    private boolean findDuplicates(int[] arr){
        Set<Integer> set = new HashSet<>(arr.length);
        for (int num : arr){
            if (set.contains(num)){
                return true;
            }    
            else{
                set.add(num);
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] array = {1,2,1,3,4};
        ContainsDuplicates containsduplicates = new ContainsDuplicates();
        boolean flag = containsduplicates.findDuplicates(array);
        System.out.println(flag);
    }
}