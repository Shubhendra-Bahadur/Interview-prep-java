import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n/2+1;i++)
        {
                for(int j=1;j<=(2*i-1);j++)
                {
                    if(j<i)
                        System.out.print(" ");
                    else
                        System.out.print("* ");
                }
             System.out.println();
                
        }
        for(int i=(n/2)+2;i<=n;i++)
        {
            for(int j=1;j<=2*(n-i)+1;j++)
            {
                if(j<=(n-i))
                    System.out.print(" ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
 
	}

}
