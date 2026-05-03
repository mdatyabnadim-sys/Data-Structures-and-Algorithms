package OOPS;
import java.util.*;
class Complex{
    double x;
    double y;
    void print(){
        if(y>0) System.out.println( x +" + "+ y +"i");
        else System.out.println (x +" - "+ -y +"i");
    }

   void add(Complex z2){
    this.x = this.x + z2.x;
    this.y = this.y + z2.y;
}

    void sub(Complex z2){
    this.x = this.x - z2.x;
    this.y = this.y - z2.y;
}

    void mul(Complex z2){
    double real = this.x*z2.x - this.y*z2.y;
    double imag = this.x*z2.y + this.y*z2.x;

    this.x = real;
    this.y = imag;
}

 void divide(Complex z2){
    double denominator = z2.x*z2.x + z2.y*z2.y;

    double real = (this.x*z2.x + this.y*z2.y) / denominator;
    double imag = (this.y*z2.x - this.x*z2.y) / denominator;

    this.x = real;
    this.y = imag;
}

}

public class ComplexNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Complex z1=new Complex();
        Complex z2=new Complex();
        System.out.println("Enter the real part of first number: ");
        z1.x=sc.nextDouble();
        System.out.println("Enter the imaginary part of first number: ");
        z1.y=sc.nextDouble();
        System.out.println("Enter the real part of second number: ");
        z2.x=sc.nextDouble();
        System.out.println("Enter the imaginary part of second number: ");
        z2.y=sc.nextDouble();

        Complex temp=new Complex();
        temp.x=z1.x;
        temp.y=z1.y;

        temp.add(z2);
        System.out.print("sum is: ");
        temp.print();

        temp=new Complex();
        temp.x=z1.x;
        temp.y=z1.y;
        temp.sub(z2);
        System.out.print("Difference is: ");
        temp.print();

        temp=new Complex();
        temp.x=z1.x;
        temp.y=z1.y;
        temp.mul(z2);
        System.out.print("Product is: ");
        temp.print();

        temp=new Complex();
        temp.x=z1.x;
        temp.y=z1.y;
        temp.divide(z2);
        System.out.print("Division is: ");
        temp.print();

        sc.close();
    }
}
