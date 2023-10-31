class fibThread extends Thread{
public void calc(){
try{
int a=0,b=1,c=0,limit;
Scanner s=new Scanner(System.in);
System.out.print("ENTER LIMIT :");
limit=s.nextInt();
System.out.print(a+" "+b+" ");
for(i=2;i<=limit;i++){
c=a+b;
a=b;
b=c;
System.out.print(c+" ");}
}
catch(Exception e){
System.out.println("Interrupted...");
}
System.out.println("Exiting A Thread");
public static void main(String arg[]){
fibThread obj=new fibThread();
obj.start();}
}
}
}


