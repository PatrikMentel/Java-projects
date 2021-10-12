/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udajeautomobil2;

/**
 *
 * @author Patko
 */
public class UdajeAutomobil2 {

    private String typ;
    private double spotreba;
    private int rok_vyroby;
    private double pocet_km;
    private double max_rychlost;

    public UdajeAutomobil2(char typ, double spotreba, int rok_vyroby, double pocet_km, double max_rychlost) {
        if(typ == 'o'){
            this.typ = "osobny";
        }else if(typ == 'n'){
            this.typ = "nakladny";
        }else{
            this.typ = "nezname";
        }
        this.spotreba = spotreba;
        this.rok_vyroby = rok_vyroby;
        this.pocet_km = pocet_km;
        this.max_rychlost = max_rychlost;
    }

    public String getTyp() {
        return typ;
    }

    public double getSpotreba() {
        return spotreba;
    }

    public int getRok_vyroby() {
        return rok_vyroby;
    }

    public double getPocet_km() {
        return pocet_km;
    }

    public double getMax_rychlost() {
        return max_rychlost;
    }
}
