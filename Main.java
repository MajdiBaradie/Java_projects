
/**
 * ? الفكرة العامه من المشرع 
      هي  بناء نظام بيسط يسمح للمستخدم ان يختار شكل من الاشكال المتاحه 
       وبيجري عليه عمليات حسابيه معينة
** --------------------------------------------------------------------------
*? مكونات المشروع 

 *!  four classes :
 => Main class : Contains the main method

 => oper class : Contains the methods for the different shapes

 => Circle class : Contains the methods for the circle

 => Rectangel class : Contains the methods for the rectangle

** --------------------------------------------------------------------------
 *? المهارات المستخدمه
 * => create a class 
 * => create an Object
 * => Differentiate between the Modifiers ( private, public )
 * => Set and Get methods
 *  => Switch 
 *  => if ... else
 *  => Main class 
 *  => import Scanner class
 
 
 *!    ملاحظه الرموز المستخدمه في التعليقات هي فقط لتلوين التعليق (! , * , ? )

 *? =>  done by : Majdi Baradie <=
 */

import java.util.Scanner; // *? A library must be added to allow the user to enter data

public class Main {
  public static void main(String[] args) { // ! Write inside it all the commands you want to execute
    oper obj = new oper();
    Scanner cin = new Scanner(System.in); // Calling Object from the Scanner class

    System.out.print(" Available shapes : \n 1. Circle \n 2. Rectangle  \n your Choise : ");
    int x = cin.nextInt();

    switch (x) {
      case 1:

        obj.show_cir(); // from oper class

        break;
      case 2:
        obj.show_rec(); // from oper class
        break;
      default:
        System.out.println("\n  Invalid value ");
        break;
    }

  }
}