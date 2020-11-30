import java.util.Scanner;
class Solution3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int tcases=sc.nextInt();
        sc.nextLine();
        int nk[]=new int [2];
        int m[]=new int [15];
        int r[]=new int [15];
        int temp=0;
        int result[]=new int [tcases];
        for(int i=0;i<tcases;i++)
        { 
            nk[0]=sc.nextInt();
            nk[1]=sc.nextInt();
            sc.nextLine();
            for(int j=0;j<nk[0];j++)
            {
                m[j]=sc.nextInt();
            }
            for(int p=0;p<nk[0];i++)
            {
                for(int q=p+1;q<nk[0];q++)
                {
                    if(m[p]<m[q])
                    {
                        temp=m[p];
                        m[p]=m[q];
                        m[q]=temp;
                    }
                }
            }
            for(int o=0;o<nk[0];o++)
            {
                if(o==0)
                {
                    result[i]=m[0]-nk[1];
                }
                else
                {
                    result[i]=result[i]*m[o];
                }
            }
        }
        for(int b=0;b<tcases;b++)
        {
            System.out.println(result[b]);
        }
    }
}
    