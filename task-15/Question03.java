import java.util.Scanner;
import java.lang.Math;
public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long n=0;
        long big[]=new long[t];
        for(int a=0;a<t;a++)
        {
            n=sc.nextLong();
            while(n%2==0)
            {
                big[a]=2;
                n=n/2;
            }
            for(int i=3;i<=(long)Math.sqrt(n);i=i+2)
            {
                while(n%i==0)
                {
                    if(i>big[a])
                    {
                        big[a]=i;
                    }
                    n=n/i;
                }
            }
            if(n>2)
            {
                if(n>big[a])
                {
                    big[a]=n;
                }
            }
        }
        for(int b=0;b<t;b++)
        {
            System.out.println(big[b]);
        }
    }
}
                    

