import  java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<=i)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            
            for(int j=n;j>=1;j--)
            {
                if(j<=i)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

	}
}
