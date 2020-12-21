import java.util.Scanner;
public class Solution
{
    public static boolean palindromeChecker(int n)
    {
        int temp=n;//temporary variable
        int rev=0;
        while(temp>0)
        {
            rev=10*rev+temp%10;
            temp=temp/10;
        }
        if(rev==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int cases=sc.nextInt();
        int big[]=new int[cases];
        int n=0;
        for(int a=0;a<cases;a++)
        {
            n=sc.nextInt();
            for(int i=100;i<1000;i++)
            {
                for(int j=100;j<1000;j++)
                {
                    if(palindromeChecker(i*j)&&n>(i*j))
                    {
                        if(big[a]<(i*j))
                        {
                            big[a]=i*j;
                        }
                     }
                }
            }
        }
        for(int q=0;q<cases;q++)
        {
            System.out.println(big[q]);
        }
    }
}
            
