class ValidateSubsequence{

    public static boolean validateSubsequence(int arr[], int []sequence){
        //keeps track of index where we found the element at sequence
        int lastPosition=0;
        
        //picks elements from the sequence array
        for(int i=0;i<sequence.length;i++){

            //checks if the sequence element is found in arr
            boolean found=false;
            for(int j=lastPosition+1;j<arr.length;j++){
                if(arr[j] == sequence[i]){
                    found = true;

                    //set the next starting position to index of sequence element
                    lastPosition=j;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a[] = {5, 1, 22, 25, 6, -1, 8, 10};
        int s[] = {1, 6, -1, 10};
        System.out.println(validateSubsequence(a,s));
    }
}