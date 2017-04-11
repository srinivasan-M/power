import java.util.*;
import java.lang.*;
class pow
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int p=Integer.parseInt(args[1]);
if(p==0)
System.out.print("1");
else
System.out.print(Math.pow(n,p));
}
}
