/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Patko
 */
public class MainProgram {
    static boolean exit1 = false;
    static boolean exit2 = false;
    public static void main(String[] args) 
    {
        boolean End = false;
        
        while (!End)
        {
            int choice1 = menu();
            switch(choice1)
            {
                case (1):
                        while (!exit1)
                        {
                            int choice2 = Bezny();
                            switch(choice2)
                            {
                                case (1): novy(); break;        
                                case (2): vklad(); break;
                                case (3): vyber(); break;
                                case (4): vypis(); break;
                                case (5): pocVk(); break;
                                case (6): pocVy(); break;
                                case (7): exit1=true; exit2=true; break;
                                default: System.out.println("Nerozumiem!"); break;
                            }
                        }
                case (2): 
                        while (!exit2)
                        {
                            int choice3 = Sporiaci();
                            switch(choice3)
                            {
                                case (1): Snovy(); break;        
                                case (2): Svklad(); break;
                                case (3): Svyber(); break;
                                case (4): Svypis(); break;
                                case (5): exit2=true; exit1=true; break;
                                default: System.out.println("Nerozumiem!"); break;
                            }
                        }
                case (3): End=true; break;
                default: System.out.println("Nerozumiem!"); break;
             }
        }
    }
    
    public static int menu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("________---------MENU---------________");
        System.out.println("(1) Bezny ucet.");
        System.out.println("(2) Sporiaci ucet.");
        System.out.println("(3) End.");
        System.out.println("____________________________________");
        System.out.print("Moznost: ");
        int choice1 = input.nextInt();
        System.out.println("____________________________________");
        return choice1;
    }
    static ArrayList<BeznyUcet> zoznamUctov = new ArrayList<BeznyUcet>();
    static ArrayList<SporiaciUcet> zoznamSporiacich = new ArrayList<SporiaciUcet>();
    //BEZNY UCET----------------------------------------------------------------
    public static int Bezny()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("________---------BEZNY UCET---------________");
        System.out.println("(1) Novy ucet.");
        System.out.println("(2) Vklad.");
        System.out.println("(3) Vyber.");
        System.out.println("(4) Zoznam uctov.");
        System.out.println("(5) Pocet vkladov.");
        System.out.println("(6) Pocet vyberov");
        System.out.println("(7) Exit.");
        System.out.println("____________________________________");
        System.out.print("Moznost: ");
        int choice2 = input.nextInt();
        System.out.println("____________________________________");
        return choice2;
    }
    public static void novy()
    {
        Scanner in3 = new Scanner(System.in);
        System.out.print("Cislo bezneho uctu: ");
        int cisloUctu = in3.nextInt();
        System.out.print("Vklad: ");
        double vklad = in3.nextDouble();
        BeznyUcet bU = new BeznyUcet(cisloUctu, vklad);
        zoznamUctov.add(bU);
        System.out.println("Bezny ucet bol vytvoreny!");
        
    }
    public static void vklad()
    {
        Scanner in2 = new Scanner(System.in);
        System.out.print("Cislo uctu: ");
        int cisloUctu = in2.nextInt();
        System.out.print("Vklad: ");
        double vklad = in2.nextDouble();
        for(BeznyUcet a : zoznamUctov)
        {
            if(a.getCisloUctu() == cisloUctu)
            {
                a.Vklad(vklad);
            }
        }
    }
    public static void vyber()
    {
        Scanner in3 = new Scanner(System.in);
        System.out.print("Cislo uctu: ");
        int cisloUctu = in3.nextInt();
        System.out.print("Vyber: ");
        double vyber = in3.nextDouble();
        for(BeznyUcet a : zoznamUctov)
        {
            if(a.getCisloUctu() == cisloUctu)
            {
                a.Vyber(vyber);
            }
        }
    }
    public static void vypis()
    {
        for(BeznyUcet a : zoznamUctov)
        {
            System.out.println("Cislo uctu: " + a.getCisloUctu());
            System.out.println("Stav uctu: " + a.getStavUctu());
            System.out.println("____________________________________");
        }
    }
    public static void pocVk()
    {
        Scanner in3 = new Scanner(System.in);
        System.out.print("Cislo uctu: ");
        int cisloUctu = in3.nextInt();
        for(BeznyUcet a : zoznamUctov)
        {
            if(a.getCisloUctu() == cisloUctu)
            {
                System.out.println(a.getPocetVkladov());
            }
        }
    }
    public static void pocVy()
    {
        Scanner in3 = new Scanner(System.in);
        System.out.print("Cislo uctu: ");
        int cisloUctu = in3.nextInt();
        for(BeznyUcet a : zoznamUctov)
        {
            if(a.getCisloUctu() == cisloUctu)
            {
                System.out.println(a.getPocetVyberov());
            }
        }
    }
    
    //SPORIACI UCET-------------------------------------------------------------
    public static int Sporiaci()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("________---------SPORIACI UCET---------________");
        System.out.println("(1) Novy ucet.");
        System.out.println("(2) Vklad.");
        System.out.println("(3) Vyber.");
        System.out.println("(4) Zoznam uctov.");
        System.out.println("(5) Exit.");
        System.out.println("____________________________________");
        System.out.print("Moznost: ");
        int choice3 = input.nextInt();
        System.out.println("____________________________________");
        return choice3;
    }
    public static void Snovy()
    {
        Scanner in4 = new Scanner(System.in);
        System.out.print("Cislo sporiaceho uctu: ");
        int cisloUctu = in4.nextInt();
        System.out.print("Vklad: ");
        double vklad = in4.nextDouble();
        SporiaciUcet sU = new SporiaciUcet(cisloUctu, vklad);
        zoznamSporiacich.add(sU);
        System.out.println("Sporiaci ucet bol vytvoreny!");
    }
    public static void Svklad()
    {
        Scanner in2 = new Scanner(System.in);
        System.out.print("Cislo sporiaceho uctu: ");
        int cisloUctu = in2.nextInt();
        System.out.print("Vklad: ");
        double vklad = in2.nextDouble();
        for(SporiaciUcet a : zoznamSporiacich)
        {
            if(a.getCisloUctu() == cisloUctu)
            {
                a.Vklad(vklad);
            }
        }
    }
    public static void Svyber()
    {
        Scanner in3 = new Scanner(System.in);
        System.out.print("Cislo sporiaceho uctu: ");
        int cisloUctu = in3.nextInt();
        System.out.print("Vyber: ");
        double vyber = in3.nextDouble();
        for(SporiaciUcet a : zoznamSporiacich)
        {
            if(a.getCisloUctu() == cisloUctu)
            {
                a.Vyber(vyber);
            }
        }
    }
    public static void Svypis()
    {
        for(SporiaciUcet a : zoznamSporiacich)
        {
            System.out.println("Cislo sporiaceho uctu: " + a.getCisloUctu());
            System.out.println("Stav uctu: " + a.getStavUctu());
            System.out.println("____________________________________");
        }
    }
}
