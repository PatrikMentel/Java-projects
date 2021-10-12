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
public class BeznyUcet extends Ucet{
    private int pocetVyberov = 0;
    private int pocetVkladov = 0;

    public BeznyUcet(int cisloUctu, double stavUctu)
    {
        super(cisloUctu, stavUctu);
        this.pocetVkladov++;
    }
    public BeznyUcet(){    
    }
    
    public void Vklad(double vklad)
    {
        setStavUctu(getStavUctu() + vklad);
        this.pocetVkladov++;
    }
    public void Vyber(double vyber)
    {
        setStavUctu(getStavUctu() + vyber);
        this.pocetVyberov++;
    }

    public int getPocetVyberov() {
        return pocetVyberov;
    }

    public int getPocetVkladov() {
        return pocetVkladov;
    }
}
