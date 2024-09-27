import java.util.Scanner;
public class IT24102552Lab7Q3
{
public static void main(String[]args)
{

Scanner input=new Scanner(System.in);

int c=0;
double d,P;
int T;

while(c<=4)
{
c=c+1;
System.out.println("Customer"+" "+c);

System.out.print("Enter total bill amount:");
 T=input.nextInt();

System.out.print("Enter mode of payment:");
char mode=input.next().charAt(0);

if(mode=='c')
{
d=T*0.05;
System.out.println("Discount is:"+d);
P=T-d;
System.out.println("Amount to be paid:"+P);
}
else if(mode=='C')
{
d=T*0.05;
System.out.println("Discount is:"+d);
P=T-d;
System.out.println("Amount to be paid:"+P);
}


else if(mode=='o')
{
System.out.println("No discount applicable");
System.out.println("Amount to be paid:"+T);
}
else if(mode=='O')
{
System.out.println("No discount applicable");
System.out.println("Amount to be paid:"+T);
}

else
{
System.out.println("Payment mode is Not Valid");
}
System.out.println();
}
}
}





