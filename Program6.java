import java.util.Scanner;

public class Program6 {
    static double rounder(double value){
        return Math.round(value*1000.0)/1000.0;
    }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        final double pi = Math.PI;
        System.out.println("Enter Radius: ");
        double radius = myScanner.nextDouble();
        double diameter = radius*2;
        double circumference = 2 * pi * radius;
        double area = pi * (radius *  radius);
        radius = rounder(radius);
        diameter = rounder(diameter);
        circumference = rounder(circumference);
        area = rounder(area);

        System.out.println("The radius of the circle = " + radius);
        System.out.println("The diameter of the circle = " + diameter);
        System.out.println("The area of the circle = " + area);
        System.out.println("The circumferecne of the circle = " + circumference);
    }
}



//Paste console output below:
/*

Enter Radius: 
3.712
The radius of the circle = 3.712
The diameter of the circle = 7.424
The area of the circle = 43.288
The circumferecne of the circle = 23.323

Process finished with exit code 0

*/
