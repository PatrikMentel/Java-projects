/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank2;

/**
 *
 * @author Patko
 */
public class Ucet {
    protected int cisloUctu;
    protected double stavUctu;
    
    public Ucet(int cisloUctu, double stavUctu) {
        this.cisloUctu = cisloUctu;
        this.stavUctu = stavUctu;
    }
    public Ucet(){   
    }
    
    public int getCisloUctu() {
        return cisloUctu;
    }

    public void setCisloUctu(int cisloUctu) {
        this.cisloUctu = cisloUctu;
    }

    public double getStavUctu() {
        return stavUctu;
    }

    public void setStavUctu(double stavUctu) {
        this.stavUctu = stavUctu;
    }
}
