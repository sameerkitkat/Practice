import java.util.HashMap;

class MajorityElement{
    
    private void findMajorityElement(int[] array){
        HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i=0;i<array.length;i++){
            if (map.containsKey(array[i])){
                int count = map.get(array[i])+1;
                if (count > array.length/2){
                    System.out.println("Majority element: "+array[i]);
                    return;
                }
                else{
                    map.put(array[i],count);
                }           
            }
            else{
                map.put(array[i], 1);
            }
        }
            System.out.println("No majority element");
    }

    public static void main(String[] args){
        int[] array = {1,2,2,3,2,4,3,1,2,2,2};
        MajorityElement majorityelement = new MajorityElement();
        majorityelement.findMajorityElement(array); 
    }
}