import java.util.Arrays;

class SortedSquaredArray{
    public static int[] sortedSquaredArray(int a[]){
        for(int i=0;i<a.length;i++){
            a[i] = a[i]*a[i];
        }
        return a;
    }
    public static void main(String[] args) {
       int array[] = {1, 2, 3, 5, 6, 8, 9};
        int a[] = sortedSquaredArray(array);
       System.out.println(Arrays.toString(a));
    }
}