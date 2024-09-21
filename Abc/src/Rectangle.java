import java.util.Scanner;

public class Rectangle {
    double high;
    double width;

    public void getInfo() {
        Scanner sc = new Scanner(System.in);
         this.high = sc.nextDouble();
         this.width = sc.nextDouble();
    }

    public double getArea() {
        return high * width;
    }

    public double getPerimeter() {
        return ( high + width )* 2;
    }

    public void display() {
        System.out.println("Area = " + getArea() );
        System.out.println( "Perimeter = " + getPerimeter() );
    }


}
