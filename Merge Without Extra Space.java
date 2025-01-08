class Solution {
    
    public void sort(int[] b,int n){
        
        for(int i=0;i<n-1;i++){
            if(b[i]>b[i+1]){
                int temp=b[i];
                b[i]=b[i+1];
                b[i+1]=temp;
                
            }else{
                return;
            }
        }
    }
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        int n=a.length;
        int m=b.length;
        
        int i=0,j=0;
        while(i<n){
            if(a[i]>b[j]){
                int temp=a[i];
                a[i]=b[j];
                b[j]=temp;
                
               sort(b,m);
            }
            ++i;
        }
        Arrays.sort(b);
        // code here
    }
}
