/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riseoftoiletpeople;

/**
 *
 * @author Christopher Pilien
 */
public class Typer {
    
    
    protected static void typing(String line, int t){
        //Prints each character of the string one by one every 0.066 seconds
        int i = 0;
        
        do{ 
            char c = line.charAt(i);
            System.out.print(c);
            pause(t);
            i++;
        }while(i < line.length());
        System.out.println();
        System.out.println();
    }
    
    protected static void pause(int t){
        //Pauses for 1 second
            try{
                Thread.sleep(t);
            }catch(InterruptedException ie) {}
    }
    
    protected static void load(){
        
        System.out.println();
        System.out.print("Loading");
        pause(750);
        System.out.print(".");
        pause(1000);
        System.out.print(".");
        pause(1000);
        System.out.println(".");
        pause(1000);
        System.out.println();
        System.out.println();
        System.out.println("Complete");
        pause(1000);
        System.out.println();
    }
}
