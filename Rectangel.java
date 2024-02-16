
/*
! Rectangle class 
? يحتوي على خصائص المستطيل و العمليات الحسابيه الخاصه به
*/
public class Rectangel {

    private double length;  //* attribute It can only be accessed through Set and Get because it is private
    private double width;  //* attribute It can only be accessed through Set and Get because it is private

    public Rectangel() {   //? Constructor contains initial values
        length = 50;
        width = 50;
    }

    public Rectangel(double Lingth, double Width)   //?  Another Constructor contains initial values that are entered by the user
      { 
         length = Lingth;
        width = Width;
    }

    public void Area_perimeter() {  // Calculate the area and perimeter of a rectangle
        System.out.println(" \n Rectangel Area = " + length * width);
        System.out.println(" \n Rectangel perimeter = " + 2 * (length + width));
    }

    public void Add(double area1, double area2) { // Sum the area of two rectangles entered by the user
        System.out.println(" \n the total area = " + (area1 + area2));

    }

    public void larger(double area1, double area2) {  // Method to Comparing the areas of two rectangles

        if (area1 > area2) {
            System.out.println("the Area of the first Rectangel is larger = " + area1 + " m^2");
        } else {
            System.out.println("the Area of the second Rectangel is larger = " + area2 + " m^2");

        }

    }

    public double getLength() {  // Method to Get the length of a rectangle
        return length;
    }

    public double getwidth() { // Method to Get the width of a rectangle
        return width;
    }

    public double setwidth(double Width) {   // Method to Set the width of a rectangle
        width = Width;
        return width;
    }

    public double setLength(double Lingth) {   // Method to Set the length of a rectangle
        length = Lingth;
        return length;
    }
      //! =>  done by : Majdi Baradie <=
}
