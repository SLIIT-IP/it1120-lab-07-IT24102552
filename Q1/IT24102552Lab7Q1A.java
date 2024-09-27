import java.util.Scanner;
public class IT24102552Lab7Q1A
{
public static void main(String[]args)
{

//Scanner input
Scanner input=new Scanner(System.in);

System.out.println("Enter marks for four subjects:");

//input spaces
System.out.print("Enter Subject Mark 1:");
int M1=input.nextInt();
System.out.print("Enter Subject Mark 2:");
int M2=input.nextInt();
System.out.print("Enter Subject Mark 3:");
int M3=input.nextInt();
System.out.print("Enter Subject Mark 4:");
int M4=input.nextInt();

//calculation
double A=(M1+M2+M3+M4)/4;

//average output
System.out.println("Average is:"+A);

//if conditions
if(A>=75&&A<=100){System.out.println("Overall Grade is: Distinction");}
else if(A>=50&&A<=74){System.out.println("Overall Grade is: Credit");}
else {System.out.println("Overall Grade is: Fail");}
}
}





