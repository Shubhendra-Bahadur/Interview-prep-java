
public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	//Your code goes here
        int m=0,j=n-1,k=1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
                arr[m++]=k++;
            else
                arr[j--]=k++;
        }
    }
} 