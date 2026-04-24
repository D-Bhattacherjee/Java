/*
 * --class and methods in java--
 * 
 * class className{
 * type var1;
 * type var2;
 * type var3;
 * ...
 * type varN;
 * }
 * 
 * 
 * type methodName(parameters){
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

// let's make vehicleclass with some methods

class vehicle {
    int passengers; // number of passengers
    int fuelcap; // fuel capacity in gallons
    int mpg; // fuel cnsumption in miles per gallon
}

public class file1 {
    public static void main(String[] args) {
        // create new object from the class vehicle
        vehicle minivan = new vehicle();
        int range;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 14;
        minivan.mpg = 21;

        range = minivan.fuelcap * minivan.mpg;

        System.out.println("Minivan can carry " + minivan.passengers + " people for " + range
                + " miles with a tank full of " + minivan.fuelcap + " gallons of fuel");
    }
}