
public class Circle {

    private double riduse; 

    public Circle() {     //? Constructor contains initial values
        riduse = 5;
    }

    public Circle(double Riduse) {  //?  Another Constructor contains initial values that are entered by the user
        riduse = Riduse;
    }

    public void printArea_circ()    // Method to Calculate the area and circumference of a circle

    {

        double Area = 3.14 * Math.pow(2, riduse);
        double circumference = 3.14 * 2 * riduse;
        System.out.println(" \n Circle Area = " + Area);
        System.out.println(" \n Circle circumference = " + circumference);

    }

    public void Add(double area1, double area2) {    // Method to Sum the area of two circles entered by the user
        System.out.println(" \n the area of ​​two circles  = " + area1 + area2);

    }

    public void larger(double area1, double area2) {   // Method to Comparing the areas of two circles
        if (area1 > area2)
            System.out.println(" \n the Area of the first circle is larger = " + area1);
        else
            System.out.println(" \n the Area of the second  circle is larger = " + area2);

    }

    public double getlingth() {  // Method to Get the ridus of a circle

        return riduse;

    }

    public double setridus(double Ridus) {  // Method to Set the ridus of a circle
        riduse = Ridus;
        return 0;
    }

     //! =>  done by : Majdi Baradie <=
}
