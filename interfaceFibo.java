import java.util.*;
class interfaceFibo implements Runnable{
public void run(){
int a=0,b=1,c=0,limit,i;
Scanner s=new Scanner(System.in);
System.out.print("Enter Limit :");
limit=s.nextInt();
System.out.print(a+" "+b+" ");
for(i=2;i<=limit;i++){
c=a+b;
a=b;
b=c;
System.out.print(c+" ");}
System.out.println();
System.out.println("Exiting A Thread.");
}
public static void main(String arg[]){
fibothread a=new fibothread();
Thread b=new Thread(a);
b.start();
}
}

