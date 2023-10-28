import java.util.*;
class asst1_ques4
{
public static void main(String arg[])
{
double amt,yrs,age,ROI1,ROI2;
Scanner s=new Scanner(System.in);
System.out.println("Enter Principle amount: ");
amt=s.nextInt();
System.out.println("Enter Time Period(in years): ");
yrs=s.nextInt();
System.out.println("Enter your Age: ");
age=s.nextInt();
if(age>=60){
System.out.println("You're a senior citizen(ROI=12%)");
ROI1=amt*0.12*yrs;
System.out.println("Interest Amount = "+ROI1);}
else{
System.out.println("You're not a senior citizen(ROI=10%)");
ROI2=amt*0.10*yrs;
System.out.println("Interest Amount = "+ROI2);}
}
}