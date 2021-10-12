/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subornahodnychcisel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patko
 */
public class SuborNahodnychCisel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        try {
            FileReader reader = new FileReader(file1);
            FileWriter writer = new FileWriter(file2);
            BufferedReader stringReader = new BufferedReader(reader);
            
            String line = stringReader.readLine();
            
            while(line != null){
                String[] pole = line.split(" ");
                
                for(String prvok : pole){
                    Integer cislo = Integer.valueOf(prvok);
                    if(cislo%2 == 0){
                        writer.write(cislo.toString() + " ");
                    }
                }
                writer.write("\n");
                line = stringReader.readLine();
            }
            reader.close();
            writer.close();
            stringReader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SuborNahodnychCisel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SuborNahodnychCisel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
