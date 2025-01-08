class Solution {
    int countFreq(int[] arr, int target) {
        int count=0;
        for(int i:arr){
            if(i==target){
                ++count;
            }
        }
        return count;
        // code here
    }
}
