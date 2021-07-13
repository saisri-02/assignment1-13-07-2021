import java.util.*;
public class Prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter n value : ");
n=sc.nextInt();
System.out.println("prime numbers from 1 to "+n+" are : ");
primeNos(n);
}
static void primeNos(int n)
{
int i,j,count=0;
for(i=1;i<=n;i++)
{
count=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
{
count++;
}
}
if(count==2)
System.out.print(" "+i);
}
}
}

output:

Enter n value : 
10
prime numbers from 1 to 10 are : 
 2 3 5 7