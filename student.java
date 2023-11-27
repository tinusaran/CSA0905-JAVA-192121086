import java.util.*;
class student{
String name;
int regNo,total=0;
double average=0;
int marks[]=new int[5];
void get(String a,int b,int c[]){
name=a;
regNo=b;
marks=c;
}
void calculate(){
int i;
for(i=0;i<5;i++){
total=total+marks[i];
}
average=total/5;
}
void display(){
System.out.println("Name of the Student : "+name);
System.out.println("Register Number : "+regNo);
System.out.println("Total Marks :"+total);
System.out.println("Average Marks : "+average);
}
public static void main(String arg[]){
String x;
int y,i;
int z[]=new int[5];
Scanner s=new Scanner(System.in);
System.out.print("Enter Name : ");
x=s.nextLine();
System.out.print("Enter Register Number : ");
y=s.nextInt();
for(i=0;i<5;i++){
System.out.print("Enter Mark "+(i+1)+":");
z[i]=s.nextInt();
}
student obj=new student();
obj.get(x,y,z);
obj.calculate();
obj.display();
}
}
 