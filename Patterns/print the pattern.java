
public class Solution {

	/* Input
	 * n - number of rows */
	public static void printPattern(int n){

		// Write your code here
        int[][] arr=new int[n][n];
        int k=n-1,m=0;
        int c=1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<n;j++)
                {
                   arr[m][j]=c++; 
                }
                m++;
            }
            else
            {
                 for(int j=0;j<n;j++)
                {
                   arr[k][j]=c++; 
                }
                k--;
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

	}
	
}
