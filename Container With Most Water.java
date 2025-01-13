class Solution {

    public int maxWater(int arr[]) {
        // Code Here
        
        //bruteforce
        
        int n=arr.length;
        int maxwater=0;
        int currwater=0;
        
        // for(int i=0;i<n-1;i++){
        //     int currwater=0;
        //     for(int j=i+1;j<n;j++){
        //         currwater=Math.min(arr[i],arr[j])*(j-i);
        //         maxwater=Math.max(currwater,maxwater);
                
                
        //     }
        // }
        int left=0,right=n-1;
        while(left<right){
            currwater=Math.min(arr[left],arr[right])*(right-left);
            maxwater=Math.max(currwater,maxwater);
            
            if(arr[left]>arr[right]){
                right--;
            }else{
                left++;
            }
            
        }
        
        return maxwater;
    }
}
