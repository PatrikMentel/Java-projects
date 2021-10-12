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
public class SporiaciUcet extends Ucet{
    private int pocetSporiacichVkladov = 1;
    public SporiaciUcet(int cisloUctu, double stavUctu)
    {
        super(cisloUctu, stavUctu);
    }
    
    public void Vklad(double vklad)
    {
        setStavUctu(getStavUctu() + vklad);
        this.pocetSporiacichVkladov++;
    }
    public void Vyber(double vyber)
    {
        if(this.pocetSporiacichVkladov >= 2)
        {
            setStavUctu(getStavUctu() + vyber);
            this.pocetSporiacichVkladov = 0;
        }
        else
        {
            System.out.println("Este si musis vlozit vklad " + this.pocetSporiacichVkladov + " krat, aby si si mohol vybrat!");
            System.out.println("____________________________________");
        }
    }
}
