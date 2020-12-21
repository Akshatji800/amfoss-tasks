import java.util.Scanner;
public class Solution
{
    public static void main(String[] args)
    {
        long t=0;
        long n=0;
        long a=0;
        long b=0;
        long c=0;
        long d=0;
        Scanner sc=new Scanner(System.in);
        t=sc.nextLong();
        for(int i=0;i<t;i++)
        {
            n=sc.nextLong();
            a=0;
            b=1;
            c=a+b;
            d=0;
            while(c<n)
            {
                if(c%2==0)
                {
                    d+=c;
                }
                a=b;
                b=c;
                c=a+b;
            }
            System.out.println(d);
        }
    }
}
