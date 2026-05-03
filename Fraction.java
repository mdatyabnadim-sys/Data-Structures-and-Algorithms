package OOPS;
import java.util.*;
class Frac{
    int num;
    int den;
    Frac(int num,int den){
        this.num=num;
        this.den=den;
        simplify();
    }
void print(){
    System.out.println(num +"/"+ den);
}
void simplify(){
   boolean isNegative=(num*den<0)? true : false;
   num=Math.abs(num);
   den=Math.abs(den);
   int hcf=gcd(num,den);
     num/=hcf;
     den/=hcf;
     if(isNegative) num= -num;
}
 int gcd(int a,int b){
    if(a==0) return b;
    return gcd(b%a,a);
 }
 void add(Frac f){
    num = num*f.den + f.num*den;
    den = den*f.den;
    simplify();
 }
 void sub(Frac f){
     num = num*f.den - f.num*den;
    den = den*f.den;
    simplify();
 }
  void mul(Frac f){
     num *= f.num;
    den *= f.den;
    simplify();
 }
  void div(Frac f){
     num *= f.den;
    den *= f.num;
    simplify();
}
}
public class Fraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numerator of first fraction: ");
        int num1=sc.nextInt();
        System.out.println("Enter the denominator of first fraction: ");
        int den1=sc.nextInt();
        System.out.println("Enter the numerator of second fraction: ");
        int num2=sc.nextInt();
        System.out.println("Enter the denominator of second fraction: ");
        int den2=sc.nextInt();
        Frac f1 = new Frac(num1,den1);
        Frac f2 = new Frac(num2,den2);
        Frac temp = new Frac(num1,den1);

        temp.add(f2);
        System.out.print("Addition is: ");
        temp.print();

        temp= new Frac(num1,den1);
        temp.sub(f2);
        System.out.print("Subtraction is: ");
        temp.print();

        temp= new Frac(num1,den1);
        temp.mul(f2);
        System.out.print("Multiplication is: ");
        temp.print();

        temp= new Frac(num1,den1);
        temp.div(f2);
        System.out.print("Division is: ");
        temp.print();

    }
}
