import java.lang.*;
class Fact
{
public static void main(String args[])
{
int i,a=5,f=1;
if(a!=0)
for(i=1;i<=a;i++)
f*=i;
System.out.println("Factorial:"+f);
}
}