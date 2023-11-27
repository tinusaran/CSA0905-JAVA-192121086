import java.util.*;
class fivethread extends Thread{
public void run(){
int i,n=5;
Scanner s=new Scanner(System.in);
for(i=1;i<=10;i++){
System.out.println(i+"x 5 = "+(i*n));}
System.out.println("A THREAD ENDED");
}
}
class tenthread extends Thread{
public void run(){
int i,n=10;
for(i=1;i<=10;i++){
System.out.println(i+"x 10 = "+(i*n));}
System.out.println("B THREAD ENDED");
}
public static void main(String arg[]){
fivethread a=new fivethread();
tenthread b=new tenthread();
a.start();
b.start();
}
}
