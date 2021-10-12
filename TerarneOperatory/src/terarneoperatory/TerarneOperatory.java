/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terarneoperatory;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Patko
 */
public class TerarneOperatory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ternarny 1 (uloha 1)
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj cislo1: ");
        int a = sc.nextInt();
        System.out.println("Zadaj cislo2: ");
        int b = sc.nextInt();
        
        int vysledok = a>b ? a:b;
        System.out.println("Vacsie je " + vysledok);
        System.out.println("___________________________________________________");
        //Ternarny 2  (uloha 2)
        System.out.println("Zadaj cislo: ");
        double x = sc.nextDouble();
        double absolutnaHodnota = x>0 ? Math.abs(x):-(x);
        System.out.println("Absolutna hodnota cisla: " + absolutnaHodnota);
        System.out.println("___________________________________________________");
        //-----------------------------------------------------------------------------
        //If 1.
        System.out.println("Zadaj percenta: ");
        double percenta = sc.nextDouble();
        if(percenta >= 90)
        {
            System.out.println("Znamka: " + "1");
        }else if(percenta >= 75)
        {
            System.out.println("Znamka: " + "2");
        }else if(percenta >= 50)
        {
            System.out.println("Znamka: " + "3");
        }else if(percenta >= 30)
        {
            System.out.println("Znamka: " + "4");
        }else
        {
            System.out.println("Znamka: " + "5");
        }
        System.out.println("___________________________________________________");
        //If 2.
        System.out.println("Zadaj cislo: ");
        double cislo = sc.nextDouble();
        if(cislo > 0)
        {
            System.out.println("Kladne!");
        }else if(cislo < 0)
        {
            System.out.println("Zaporne!");
        }else
        {
            System.out.println("Nula!");
        }
        System.out.println("___________________________________________________");
        //-----------------------------------------------------------------------------
        //Switch 1 (uloha 1)
        System.out.println("Zadaj cislo od 1 po 9: ");
        int c = sc.nextInt();
        String number = "";
        switch(c){
            case 1: number = "One!";break;
            case 2: number = "Two!";break;
            case 3: number = "Three!";break;
            case 4: number = "Four!";break;
            case 5: number = "Five!";break;
            case 6: number = "Six!";break;
            case 7: number = "Seven!";break;
            case 8: number = "Eight!";break;
            case 9: number = "Nine!";break;
            default:
                System.out.println("Unrecognised");
        }
        System.out.println(number);
        System.out.println("___________________________________________________");
        //Switch 2 (uloha 2)
        System.out.println("Zadaj cislo od 1 po 7: ");
        int d = sc.nextInt();
        String day = "";
        switch(d){
            case 1: day = "Monday!";break;
            case 2: day = "Tuesday!";break;
            case 3: day = "Wednesday!";break;
            case 4: day = "Thursday!";break;
            case 5: day = "Friday!";break;
            case 6: day = "Saturday!";break;
            case 7: day = "Sunday!";break;
            default:
                System.out.println("Unrecognised");
        }
        System.out.println("Day: " + day);
        System.out.println("___________________________________________________");
        //-----------------------------------------------------------------------------
        //Cyklus 1 (uloha1)
        double sucet = 0;
        double priemer = 0;
        double priemer2 = 0;
        double maximum = 0;
        double minimum = maximum;
        double p;
        do
        {
            System.out.println("Zadaj cislo: ");
            p = sc.nextDouble();
            priemer2++;
            sucet = sucet + p;
            priemer = sucet/(priemer2-1);
            if(maximum<=p)
            {
                maximum = p;
            }else
            {
                maximum = maximum;
            }
            if(minimum>=p)
            {
                minimum = p;
            }else if(minimum>=p || p == 0)
            {
                minimum = minimum;
            }
        }while(p!=0);
        System.out.println("Sucet: " + sucet);
        System.out.println("Priemer: " + (Math.round(priemer))*100/100);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("___________________________________________________");
        //-----------------------------------------------------------------------------
        //Cyklus 2  (uloha2)
        System.out.println("Zadaj cislo:");
        int n = sc.nextInt();
        int v = 1;
        for(int i = 1; i < n+1; i++)
        {
            v = v*i;
        }
        System.out.println("Sucin cisel od 1 po n(faktorial): " + v);
        System.out.println("___________________________________________________");
        //-----------------------------------------------------------------------------
        //Cyklus a retazcove operacie 1 (uloha 6)
        System.out.println("Zadaj text: ");
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        boolean m = false;
        int k = 0;
        for(int j = 0; j < s1.length()-1; j++)
        {
            if(s1.charAt(j) != '1' || s1.charAt(j) != '0')
            {
                k++;
            }
        }
        if(k == 0)
        {
            System.out.println("Binarne cislo!");
        }else if (k > 0)
        {
            System.out.println("Nie je binarne!");
        }
        System.out.println("___________________________________________________");
        //-----------------------------------------------------------------------------
        //Cyklus a retazcove operacie 2 (uloha 14)
        String znaky = "ka";
        String veta = "Kratka";
        boolean hej = false;
        if(znaky.charAt(0) == veta.charAt(veta.length()-1) && znaky.charAt(1) == veta.charAt(veta.length()-2))
        {
            hej = true;
        }
        else
        {
            hej = false;
        }
        if(hej = true)
        {
            System.out.println("Je to tak!");
        }else
        {
            System.out.println("Nie je to tak!");
        }
        System.out.println("___________________________________________________");
        //-----------------------------------------------------------------------------
        //Cyklus a retazcove operacie 2 (uloha 4)
        System.out.println("Zadaj text: ");
        String s2 = in.nextLine();
        int poc = 0;
        for(int i = 0; i < s2.length(); i++)
        {
            if(s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i' ||s2.charAt(i) == 'o' || s2.charAt(i) == 'u' ||s2.charAt(i) == 'y'
                    || s2.charAt(i) == 'A' || s2.charAt(i) == 'E' || s2.charAt(i) == 'I' || s2.charAt(i) == 'O' || s2.charAt(i) == 'U' || s2.charAt(i) == 'Y')
            {
                poc++;
            }
        }
        System.out.println("Pocet samohlasok: " + poc);
        System.out.println("___________________________________________________");
        //-----------------------------------------------------------------------------
    }
}

