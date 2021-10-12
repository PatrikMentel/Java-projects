/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaretazce;

import java.util.Scanner;

/**
 *
 * @author Patko
 */
public class Heslo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String heslo = "RybickyZuzka123";
        System.out.println("Zadaj heslo: ");
        String zadaneHeslo = sc.nextLine();
        //SPRAVNE
        if(zadaneHeslo.equalsIgnoreCase(heslo))
        {
            if(zadaneHeslo.equals(heslo))
            {
                System.out.println("Heslo je spravne!");
            }
            //KONTROLA VELKYCH PISMEN
            else
            {
                System.out.println("Problem s velkymi pismenami!");
            }
        }
        //NESPRAVNE
        else
        {
            //KONTROLA POCTU ZNAKOV
            if(zadaneHeslo.length() == (heslo.length()))
            {
                System.out.println("Hesla sa zhoduju v dlzke ale nie su rovnake!");
            }
            else if(zadaneHeslo.length() < heslo.length())
            {
                System.out.println("Moc kratke");
            }
            else if(zadaneHeslo.length() > heslo.length())
            {
                System.out.println("Moc dlhe");
            }
            //----------------------------------------------------------------------------------------
            //KONTROLA 1. 5. A POSLEDNEHO ZNAKU
            System.out.println("Zadaj 1) 5) a posledny znak hesla(a b c): ");
            String znakyHesla = sc.nextLine();
            
            char a = znakyHesla.charAt(0);
            char b = znakyHesla.charAt(2);
            char c = znakyHesla.charAt(4);
            //PRVY
            if(a == (heslo.charAt(0)))
            {
                System.out.println("Prvy znak mas spravne!");
            }
            else
            {
                System.out.println("Prvy znak mas nespravne!");
            }
            //PIATY
            if(b == (heslo.charAt(4)))
            {
                System.out.println("Piaty znak mas spravne!");
            }
            else
            {
                System.out.println("Piaty znak mas nespravne!");
            }
            //POSLEDNY
            if(c == (heslo.charAt(heslo.length()-1)))
            {
                System.out.println("Posledny znak mas spravne!");
            }
            else
            {
                System.out.println("Posledny znak mas nespravne!");
            }
        }
    }
}
