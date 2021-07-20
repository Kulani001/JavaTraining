/*  Programmer: Kulani Makhubele
    Date Created: 18-Jul-21
    Filename: OOPConcepts.java
    Classname: InputDevice.java
    Description: Identify objects in a supermarket
*/
package supermarket;

public class InputDevice {

    //properties
        private String Name;
        private int SerialNumber;
        private String Brand;
        private String Color;

    //abstraction excludes the unnecessary properties
    //double price;

    //encapsulation encapsulates the code by assigning the private access modifier to the properties
    //get() allows other classes to use the property
    //set() allows other classes to assign new value to the property

        public int getSerialNumber() {
            return SerialNumber;
    }

    public void setColor(String color) {
        Color = color;
    }

    public static void scans(){
            System.out.println("the scanner scans the product barcode");
        }

}
