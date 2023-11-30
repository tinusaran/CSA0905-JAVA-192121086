import java.util.*;
class ArrayComposite{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
int size,i,j;
int count=0;
System.out.print("Enter the size of array : ");
size=s.nextInt();
int[] arr=new int[size];
System.out.print("Enter the Array Elements :");
for(i=0;i<size;i++){
arr[i]=s.nextInt();
}
System.out.println("Composite Numbers in Array : ");
for(i=0;i<size;i++){
int flag=0;
for(j=1;j<=arr[i];j++){
if(arr[i]%j==0){
flag++;}
}
if(flag>2){
count++;
System.out.println(arr[i]+" ");}
}
System.out.print("Number of Composite numbers in array = "+count);
}
}
