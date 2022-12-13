import java.util.Arrays;

class TwoSum{
    public static int [] twoSum(int []a, int target){
        int [] result = null;
        for(int i=0;i<a.length;i++){
            boolean found = false;
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j] == target){
                    result = new int[]{a[i], a[j]};
                    found = true;
                    break;
                }
            }
            if(found) break;
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