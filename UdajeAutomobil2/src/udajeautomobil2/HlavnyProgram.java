/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udajeautomobil2;

import java.util.Scanner;

/**
 *
 * @author Patko
 */
public class HlavnyProgram {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj typ(o-osobny, n-nakladny): ");
        char typ = sc.next().charAt(0);
        System.out.println("Zadaj spotrebu: ");
        double spotreba = sc.nextDouble();
        System.out.println("Zadaj rok vyroby: ");
        int rok_vyroby = sc.nextInt();
        System.out.println("Zadaj pocet najazdenych kilometrov: ");
        double pocet_km = sc.nextDouble();
        System.out.println("Zadaj maximalnu rychlost: ");
        double max_rychlost = sc.nextDouble();
        
        UdajeAutomobil2 u = new UdajeAutomobil2(typ, spotreba, rok_vyroby, pocet_km, max_rychlost);
        
        System.out.println("____________________________________________________________");
        System.out.println("Typ: " + u.getTyp());
        System.out.println("Spotreba: " + u.getSpotreba());
        System.out.println("Rok vyroby: " + u.getRok_vyroby());
        System.out.println("Pocet najazdenych km: " + u.getPocet_km());
        System.out.println("Maximalna rychlost: " + u.getMax_rychlost());
        System.out.println("____________________________________________________________");
    }
}
