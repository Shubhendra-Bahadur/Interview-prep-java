import java.util.*;
public class Solution {

	public static void printPattern(int n){
		
		/* Don't write main().
		 Don't read input, it is passed as function argument.
		 Print output as per the question.
		*/		
        int c;
        for(int i=0;i<n;i++)
        {
            c=n;
            for(int j=0;j<n;j++)
            {
                if(j<i)
                    System.out.print(c--+" ");
                else
                    System.out.print(c+" ");
            }
            
            c=n-i;
            
            for(int j=n+1;j<=2*n-1;j++)
            {
                if(j>(2*n-1-i))
                    System.out.print(++c+" ");
                else
                    System.out.print(c+" ");
            }
            System.out.println();
        }
        
        for(int i=0;i<n-1;i++)
        {
            c=n;
            for(int j=0;j<n-1;j++)
            {
                if(j<n-2-i)
                    System.out.print(c--+" ");
                else
                    System.out.print(c+" ");
            }
            
            c=i+2;
            
            for(int j=n;j<=2*n-1;j++)
            {
                if(j<n+i+1)
                    System.out.print(c+" ");
                else
                    System.out.print(c+++" ");
            }
            System.out.println();
        }

	}
}
