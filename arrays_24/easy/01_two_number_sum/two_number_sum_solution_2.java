import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum{
    public static int [] twoSum(int []a, int target){
        int [] result = null;
        Map<Integer, Integer> map = new HashMap<>();

        map.put(target - a[0],0);
        for(int i=1;i<a.length;i++){
            if(map.containsKey(a[i])){
                result = new int[]{target - a[i], a[i]};
                break;
            }
            else{
                map.put(target-a[i], i);   
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {3, 5, -4, 8, 11, 1, -1, 6};
        int target = 10;
        int []a=twoSum(arr, target);
        System.out.println(Arrays.toString(a));
        
    }
}