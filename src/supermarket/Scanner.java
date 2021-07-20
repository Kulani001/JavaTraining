/*  Programmer: Kulani Makhubele
    Date Created: 18-Jul-21
    Filename: OOPConcepts.java
    Classname: Scanner.java
    Description: Identify objects in a supermarket
*/
package supermarket;

    //inheritance allows child class to inherit members of the parent class
    // no need to import inputdevice because both classes are in the same package

public class Scanner extends InputDevice{

        String Name;
        int SerialNumber;
        String color;

    //polymorphism object taking many forms by overloading or overriding the parent class behavior
        public static void scans(){
            System.out.println("the scanner displays product price");
    }


}
