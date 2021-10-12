/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleinterface;

/**
 *
 * @author Patko
 */
public class VehicleInterface {

    
    public static void main(String[] args) {
        System.out.println("_____________________________________________________________");
        Bike b = new Bike();
        b.changeGear(10);
        System.out.println("Gear of bike No." + b.gear);
        System.out.println("_____________________________________________________________");
        b.speedUp(30);
        System.out.println("Speeding up...");
        System.out.println("Speed of bike No." + b.speed);
        System.out.println("_____________________________________________________________");
        b.applyBrakes(30);
        System.out.println("Slowing down...");
        System.out.println("Speed of bike No." + b.speed);
        System.out.println("_____________________________________________________________");
        
        Car c = new Car();
        c.changeGear(20);
        System.out.println("Gear of car No." + c.gear);
        System.out.println("_____________________________________________________________");
        c.speedUp(90);
        System.out.println("Speeding up...");
        System.out.println("Speed of car No." + c.speed);
        System.out.println("_____________________________________________________________");
        c.applyBrakes(90);
        System.out.println("Slowing down...");
        System.out.println("Speed of car No." + c.speed);
        System.out.println("_____________________________________________________________");
    }
    
}
