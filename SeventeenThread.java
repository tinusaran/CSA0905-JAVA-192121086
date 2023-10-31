import java.util.*;
class ThirteenThread implements Runnable{
public void run(){
try{
int i;
for(i=1;i<=10;i++){
System.out.println(i+" x 13 = "+(i*13));}
}
catch(Exception e){
System.out.println("Interrupted...");
}
System.out.println("Exiting A Thread");
}
}
class SeventeenThread implements Runnable{
public void run(){
try{
Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
int i;
for(i=1;i<=10;i++){
System.out.println(i+" x 17 = "+(i*17));}
}
catch(Exception e){
System.out.println("Interrupted...");
}
System.out.println("Exiting B Thread");
}
public static void main(String arg[]){
ThirteenThread obj1=new ThirteenThread();
Thread t1=new Thread(obj1);
t1.start();
SeventeenThread obj2=new SeventeenThread();
Thread t2=new Thread(obj2);
t2.start();
}
}