import java.util.Scanner;
public class IT24102552Lab7Q1B
{
public static void main(String[]args)
{
Scanner input=new Scanner(System.in);

//for loop
for(int Student=1; Student<=3; Student=Student+1)
{
System.out.println("Student"+Student);

System.out.print("Enter Marks:");
int M1=input.nextInt();
int M2=input.nextInt();
int M3=input.nextInt();
int M4=input.nextInt();

//average
double A=(M1+M2+M3+M4)/4;
System.out.println("Average is:"+A);

//if condition to get grade
if(A>=75&&A<=100){System.out.println("Overall Grade is: Distinction");}
else if(A>=50&&A<=74){System.out.println("Overall Grade is: Credit");}
else {System.out.println("Overall Grade is: Fail");}
System.out.println("  ");
}
}
}
