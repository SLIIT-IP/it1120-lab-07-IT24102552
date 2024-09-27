public class IT24102552Lab7Q2B
{
public static void main(String[]args)
{
int i,j,n=0;
for(i=1;i<=5;i=i+1)
{
n=n+1;
System.out.print(n+"-");
for(j=1;j<=i;j=j+1)
{
System.out.print("*");
}
System.out.println();
}
}
}