/*
 ! oper class 
 ? يحتوي على العمليات  لكل الاشكال حيث فام باستدعاء خواص كل شكل من الكلاس الخاص به
 
 * */

import java.util.Scanner;

public class oper {
    Scanner cin = new Scanner(System.in);       // Definition ( cin )  Object from Class Scanner 
    Circle Area_c = new Circle();              // Definition ( Area_c )  Object from Class Circle
    Rectangel Area_r = new Rectangel();       // Definition ( Area_r ) Object from Class Rectangle

    public void show_cir() { // * It contains the circuit's operations
        System.out.print(
                " what What you want to do \n 1. Area and circumference of a circle \n 2. Add the area of ​​two circles \n 3. Comparison between two circles \n your Choise :");
        int x = cin.nextInt();
        switch (x) {
            case 1:
                System.out.println("\n  Enter the riduse ");
                Area_c.setridus(cin.nextDouble());
                Area_c.printArea_circ();

                break;
            case 2:
                System.out.print(" Enter the farst area :  ");
                double z = cin.nextDouble();
                System.out.print("\n Enter the  second area :  ");
                double k = cin.nextDouble();
                Area_c.Add(z, k);
                break;
            case 3:
                System.out.print(" Enter the farst area :  ");
                double w = cin.nextDouble();
                System.out.print("\n Enter the  second area :  ");
                double d = cin.nextDouble();
                Area_c.larger(w, d);

            default:
                System.out.println("\n  Invalid value ");

                break;
        }

    }

    public void show_rec() { // * It contains the rectangle operations
        System.out.print(
                " What you want to do \n 1.Area and perimeter of a rectangle \n 2. Add the area of  two rectangle  \n 3. Comparison between two rectangle  \n your Choise :");
        int x = cin.nextInt();
        switch (x) {
            case 1:
                System.out.print("\n Enter Rectangle Length : ");
                Area_r.setLength(cin.nextDouble());
                System.out.println("\n Enter Rectangle Width :  ");
                Area_r.setwidth(cin.nextDouble());
                Area_r.Area_perimeter();
                break;

            case 2:
                System.out.print(" Enter the farst area :  ");
                double z = cin.nextDouble();
                System.out.print("\n Enter the  second area :  ");
                double k = cin.nextDouble();
                Area_r.Add(z, k);

                break;

            case 3:
                System.out.print(" Enter the farst area :  ");
                double w = cin.nextDouble();
                System.out.print("\n Enter the  second area :  ");
                double d = cin.nextDouble();
                Area_r.larger(w, d);
                break;
            default:
                System.out.println("\n  Invalid value ");

                break;
        }

    }
    // ! => done by : Majdi Baradie <=
}
