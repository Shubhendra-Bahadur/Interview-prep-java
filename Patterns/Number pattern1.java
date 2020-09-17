import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        
        for(int i=0;i<n;i++)
        {
            c=i;
            for(int j=1;j<=n;j++)
            {
                if(j<n-i)
                    System.out.print(" ");
                else
                    System.out.print(++c);
            }
            System.out.println();
        }

		
	}

}
