package tintmachine;

import java.util.Scanner;
/**
 *
 * @author tmeutz
 */
public class TintClient {
    
    /**
     * CIT-244 Final Project
     * 
     * @param args 
     */
    public static void main(String[] args) {
        TintMachine tm = new TintMachine();
        //Sets Colorant levels inside the machine in ounces
        tm.setColorentRed(54);
        tm.setColorentGreen(65);
        tm.setColorentBlue(67);
        
        try{
            tm.setTintMode(Modes.TINTING);
            System.out.println("Control Number: " + tm.CheckTinter());
            
        }catch (TintExeption te){
            System.out.println("ERROR: " + te.error.name());
        }
    }
}
