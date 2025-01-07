class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int count =0;
        
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(int i=0;i<n;i++){
            map.put(arr[i],map.get(arr[i])-1);
            if(map.containsKey(target-arr[i])){
                count+=map.get(target-arr[i]);
            }
        }
        return count;
    }
}
