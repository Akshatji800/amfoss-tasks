import java.util.Scanner;
public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int lcm[]=new int[t];
        for(int a=0;a<t;a++)
        {
            int n=sc.nextInt();
            lcm[a]=1;
            for(int i=1;i<=n;i++)
            {
                int n1=lcm[a];
                int n2=i;
                int hcf=n1;
                int temp=n2;
                while(hcf!=temp)
                {
                    if(hcf>temp)
                    {
                        hcf=hcf-temp;
                    }
                    else
                    {
                        temp=temp-hcf;
                    }
                }
                lcm[a]=(n1*n2)/hcf;
                while(hcf!=temp)
                {
                    if(hcf>temp)
                    {
                        hcf=hcf-temp;
                    }
                    else
                    {
                        temp=temp-hcf;
                    }
                }
                lcm[a]=(n1*n2)/hcf;
            }
        }
        for(int b=0;b<t;b++)
        {
            System.out.println(lcm[b]);
        }
    }
}
