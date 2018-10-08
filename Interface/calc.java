// This program is used to show the use of interface in java

import java.io.*;     // Imports the input and output
import java.util.Scanner; // Imports the scanner class
interface area{
    void compute(double l , double w);
}

class rectangle implements area{
    public void compute(double l,double w)
    {
        double rect = l*w;
        System.out.println("Area of the rectange is:  "+rect);
    }
}

 class square implements area{
    public void compute(double l , double w)
    {
        double squareArea = l*l;
        System.out.println("Are of the square is:  "+squareArea);
    }
}

 class circle implements area{
    public void compute(double l, double w)
    {
        double circleArea = 3.14*l*l;
        System.out.println("Area of the circle is:  "+circleArea);
    }
}

public class calc{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the values");
        double l = sc.nextDouble();
        double w =sc.nextDouble();
        rectangle r = new rectangle();
        square s = new square();
        circle c = new circle();
        area a;
        a = r;
        a.compute(l,w);
        a = s ;
        a.compute(l,w);
        a = c;
        a.compute(l,w);
    }
}