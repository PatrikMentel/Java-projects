/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvojrozmernepole;

import java.util.Random;

/**
 *
 * @author Patko
 */
public class DvojrozmernePole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] pole = new int[8][8];
        Random rand = new Random();
        int sucet = 0;
        int pocet = 0;
        int pA = 0;
        int pB = 0;
        int VP = 0;
        
        for(int i = 0; i < pole.length; i++)
        {
            for(int j = 0; j < pole.length; j++)
            {
                int cislo = rand.nextInt(20);
                pole[i][j] = cislo;
                sucet += cislo;
            }
        }
        System.out.println("POLE: ");
        for(int i = 0; i < pole.length; i++)
        {
            for(int j = 0; j < pole.length; j++)
            {
                System.out.print(pole[i][j]);
                System.out.print(" ");
                pocet ++;
                if(pocet>=8)
                {
                    System.out.print("\n");
                    pocet = 0;
                }
            }
        }
        System.out.println("SUCET: ");
        System.out.println(sucet);
        System.out.println("________________________________________________________________");
        
        //Bonus pre pokročilých
        Random r = new Random();
        int [][] poleA = new int[3][3];
        int [][] poleB = new int[3][3];
        int [][] VyslednePole = new int[3][3];
       //PoleA - zapis cisel
        for(int i = 0; i < poleA.length; i++)
        {
            for(int j = 0; j < poleA.length; j++)
            {
                int cislo = r.nextInt(10);
                poleA[i][j] = cislo;
            }
        }
        //PoleB - zapis cisel
        for(int i = 0; i < poleB.length; i++)
        {
            for(int j = 0; j < poleB.length; j++)
            {
                int cislo = r.nextInt(10);
                poleB[i][j] = cislo;
            }
        }
        //VyslednePole - zapis cisel
        for(int i = 0; i < VyslednePole.length; i++)
        {
            for(int j = 0; j < VyslednePole.length; j++)
            {
                VyslednePole[i][j] = poleA[i][j] * poleB[i][j];
            }
        }
        //PoleA - vypis cisel
        System.out.println("PoleA: ");
        for(int i = 0; i < poleA.length; i++)
        {
            for(int j = 0; j < poleA.length; j++)
            {
                System.out.print(poleA[i][j]);
                System.out.print(" ");
                pA++;
                if(pA>=3)
                {
                    System.out.print("\n");
                    pA = 0;
                }
            }
        }
        //PoleB - vypis cisel
        System.out.println("PoleB: ");
        for(int i = 0; i < poleB.length; i++)
        {
            for(int j = 0; j < poleB.length; j++)
            {
                System.out.print(poleB[i][j]);
                System.out.print(" ");
                pB++;
                if(pB>=3)
                {
                    System.out.print("\n");
                    pB = 0;
                }
            }
        }
        //VyslednePole - vypis cisel
        System.out.println("Vysledne pole: ");
        for(int i = 0; i < VyslednePole.length; i++)
        {
            for(int j = 0; j < VyslednePole.length; j++)
            {
                System.out.print(VyslednePole[i][j]);
                System.out.print(" ");
                VP++;
                if(VP>=3)
                {
                    System.out.print("\n");
                    VP = 0;
                }
            }
        }
        
    }
    
}
