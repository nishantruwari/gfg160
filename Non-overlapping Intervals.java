class Solution {
    static int minRemoval(int intervals[][]) {
        int count=0;
        //sorting based on last element
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
       //keeps the record of last non overlapping intervals end 
        int prevend=intervals[0][1];
        int n=intervals.length;
        
        if(n==1) return 0;
        for(int i=1;i<n;i++){
            
            if(prevend>intervals[i][0]){
                //++i;
                ++count;
            }else{
                prevend=intervals[i][1];
            }
            
        }
        
        return count;
        // code here
    }
}
