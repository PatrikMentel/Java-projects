/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamecharacters;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Patko
 */
public class GameCharacters {
    
    static Warrior hero = new Warrior();
    static Mage mage = new Mage();
    
    public static boolean endGame = false;
    public static void main(String[] args) {
        
        while (!endGame)
        {
            int player1 = player1menu();
            switch(player1)
            {
                case (1): attck(1); break;        
                case (2): hlth(1); break;
                case (3): endGame=true;break;
                default: System.out.println("Dont understand!");
            }

            int player2 = player2menu();
            switch(player2)
            {
                case (1): attck(2); break;        
                case (2): hlth(2); break;
                case (3): endGame=true;break;
                default: System.out.println("Dont understand!");
            }
        }
    }
    
    public static int player1menu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("________---------" + "Warrior" + "---------________");
        System.out.println("(1) Attack.");
        System.out.println("(2) Heal.");
        System.out.println("(3) End game.");
        System.out.println("____________________________________");
        System.out.print("Choice: ");
        int choice = input.nextInt();
        System.out.println("____________________________________");
        return choice;
    }
        
    public static int player2menu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("________---------" + "Mage" + "---------________");
        System.out.println("(1) Attack.");
        System.out.println("(2) Heal.");
        System.out.println("(3) End game.");
        System.out.println("____________________________________");
        System.out.print("Choice: ");
        int choice = input.nextInt();
        System.out.println("____________________________________");
        return choice;
    }
    
    static void attck(int heroID){
        if(heroID == 1){
            hero.attack(mage);
        }else if(heroID == 2){
            mage.attack(hero);
        }
    }
    static void hlth(int heroID){
        if(heroID == 1){
            hero.heal(mage);
        }else if(heroID == 2){
            mage.heal(hero);
        }
    }
}
