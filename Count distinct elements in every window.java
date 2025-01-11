class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        HashMap<Integer,Integer> freq=new HashMap<>();
        int n=arr.length;
        if(k>n){
            return list;
        }
        for(int i=0;i<k;i++){
            set.add(arr[i]);
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
            
            
            
        }
        list.add(set.size());
        int s=0;
        
        for(int i=k;i<n;i++){
            freq.put(arr[s],freq.get(arr[s])-1);
            if(freq.get(arr[s])==0){
                set.remove(arr[s]);
            }
            
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
            ++s;
            
            set.add(arr[i]);
            list.add(set.size());
        }
        
        return list;
    }
}
