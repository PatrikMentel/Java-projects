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
public class Bike implements Vehicle{
    int gear;
    int speed;
    
    Bike(){
        
    }
    
    @Override
    public void changeGear(int gear)
    {
        this.gear = gear;
    }
    @Override
    public void speedUp(int speed)
    {
        this.speed += speed;
    }
    @Override
    public void applyBrakes(int speed)
    {
        this.speed -= speed;
    }
}
