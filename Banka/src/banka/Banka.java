/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banka;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ivan Polák
 */
public class Banka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Ucet> zoznam = new ArrayList<Ucet>();
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            double v = sc.nextDouble();
            if(v == -1)  break;
            Ucet u = new Ucet(v);
            zoznam.add(u);
        }
        
        
        for(Ucet u : zoznam) {
            System.out.println("cislo:"+u.getCisloUctu());
            System.out.println("stav:"+u.getStav());
        }
        
    }
    
}
