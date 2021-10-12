/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banka;

/**
 *
 * @author Ivan Polák
 */
public class Ucet {
    private int cisloUctu;
    private double stav;
    
    static private int pocetuctov = 0;
    static private double spolu = 0.0;

    public Ucet(int cisloUctu, double stav) {
        this.cisloUctu = cisloUctu;
        this.stav = stav;
        
        pocetuctov++;
    }
    
    public Ucet(double stav) {
        pocetuctov++;
        
        this.cisloUctu = pocetuctov;
        this.stav = stav;
    }

    public int getCisloUctu() {
        return cisloUctu;
    }

    public double getStav() {
        return stav;
    }

   public void vklad(double v) {
       if(v > 0) {
        stav += v; 
        System.out.println("Novy stav uctu je:" + stav);
       } else {
           System.out.println("Nie je mozne vlozit zapornu hodnotu");
       }
   }
   
   public void vyber(double v) {
       v = Math.abs(v);
       if(v<=stav){
           stav-=v;
       } else {
           System.out.println("Nemate dost penazi na ucte");
       }
   }
    
    
    
    
    
}
