import java.util.*;
class asst1_ques1
{
public static void main(String arg[])
{
int i,m,n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of m : ");
m=s.nextInt();
System.out.println("Enter the value of n : ");
n=s.nextInt();
for(i=1;i<=n;i++){
System.out.println(i+"x"+m+"="+i*m);
}
}
}