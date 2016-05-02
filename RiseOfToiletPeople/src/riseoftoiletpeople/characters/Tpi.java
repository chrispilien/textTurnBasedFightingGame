/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riseoftoiletpeople.characters;

/**
 *
 * @author trsguests
 */
public class Tpi extends Characters{
    
    public Tpi(){
        super("T'pi", 125, 100, 120, 125, 100, 300, intro);
    }
    
    private static final String DIALOG_01 = "Mer'Da... Is'Bu... such a WASTE of potential...";
    private static final String DIALOG_02 = "YOU SHALL PAY FOR WHAT YOU HAVE DONE";
    private static final String DIALOG_03 = "I, T'PI, Master of everything else that was FLUSHED";
    private static final String DIALOG_04 = "WILL GIVE NO TIME TO RECOVER!";
    private static final String DIALOG_05 = "And you will soon be sleeping with the GOLDFISH.";
    private static final String DIALOG_06 = "After I am finished WIPING the life out of you,";
    private static final String DIALOG_07 = "the PERIOD of human dominance is at it's end.";
    
    private static String [] intro = {DIALOG_01, DIALOG_02, DIALOG_03, DIALOG_04, DIALOG_05, DIALOG_06, DIALOG_07};
    
    public static void preFight(){
        for(String s: intro){
            System.out.println();
            System.out.println(s);
            pause(2000);
        }
    }
    
   public static void main(String[] args){
       Characters tpi = new Tpi();
       preFight();
       
       System.out.println();
       pause(1000);
       System.out.println("Name: " + tpi.getName());
       pause(1000);
       System.out.println("HP: " +tpi.getHP());
       pause(1000);
       System.out.println("Stamina: " +tpi.getST());
       pause(1000);
       System.out.println("Attack: " +tpi.getAtk());
       pause(1000);
       System.out.println("Defence: " +tpi.getDef());
       pause(1000);
       System.out.println("Speed: " +tpi.getSpd());
       pause(1000);
       System.out.println("Accuracy: " +tpi.getPrc() + "%");
   }
    
}
