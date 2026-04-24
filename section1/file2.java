/**
 * * type methodName(parameters){
 * //Body of the method
 * }
 * 
 * type methodName2(parameters){
 * //Body of the method
 * }
 * 
 * type methodName3(parameters){
 * //Body of the method
 * }
 */

class vehicle2nd {
    int passengers; // number of passengers
    int fuelcap; // fuel capacity in gallons
    int mpg; // fuel cnsumption in miles per gallon

    // now to make a method to display the range of vehicles
    void range() {
        System.out.println("Range is " + (fuelcap * mpg) + " for the vehicle");
    }
}

// package section1;

public class file2 {
    public static void main(String[] args) {

        vehicle2nd LambrghiniCountouch = new vehicle2nd();
        LambrghiniCountouch.passengers = 2;
        LambrghiniCountouch.fuelcap = 25;
        LambrghiniCountouch.mpg = 9;

        LambrghiniCountouch.range();
    }
}