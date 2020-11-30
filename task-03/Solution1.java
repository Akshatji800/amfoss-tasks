import java.util.Scanner;
class Solution1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int papertype=sc.nextInt();
        sc.nextLine();
        int paperreq[]=new int [papertype];
        for(int i=0;i<papertype;i++)
        {
            paperreq[i]=sc.nextInt();
        }
        int paperava[]=new int [papertype];
        for(int j=0;j<papertype;j++)
        {
            paperava[j]=sc.nextInt();
        }
        int result[]=new int [papertype];
        for(int q=0;q<papertype;q++)
        {
           result[q]=paperava[q]/paperreq[q];
        }
        int fresult=0;
        int flag=0;
        for(int p=0;p<papertype;p++)
        {
            if(result[p]<result[papertype-1])
            {
                fresult=result[p];
                flag=1;
            }
            if(flag!=1)
            {
                fresult=1;
            }
        }
        System.out.println(fresult);
    }
}