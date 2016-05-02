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
public class Merda extends Characters{
    
    public Merda(){
        super("Mer'Da", 200, 100, 150, 50, 10, 100, intro);
    }
    
    private static final String DIALOG_01 = "Is'Bu...";
    private static final String DIALOG_02 = "You just shattered my world to feces...";
    private static final String DIALOG_03 = "Give me a moment, this is a big load to take in.";
    private static final String DIALOG_04 = "Boy, does this stink...";
    private static final String DIALOG_05 = "Thank you. I needed some time to digest the situation.";
    private static final String DIALOG_06 = "*Ahem* I, Mer'Da, the #2 fighter";
    private static final String DIALOG_07 = "shall jettison you all they way to Uranus!";
    private static final String DIALOG_08 = "Butt, because your life is dangling from a colon,";
    private static final String DIALOG_09 = "I hope you have a cup and two girls handy!";
    
    private static String [] intro = {DIALOG_01, DIALOG_02, DIALOG_03, DIALOG_04, DIALOG_05, DIALOG_06, DIALOG_07, DIALOG_08, DIALOG_09};
    
    public static void preFight(){
        for(String s: intro){
            System.out.println();
            System.out.println(s);
            pause(2000);
        }
    }
    
   public static void main(String[] args){
       Characters merda = new Merda();
       preFight();
       
       System.out.println();
       pause(1000);
       System.out.println("Name: " + merda.getName());
       pause(1000);
       System.out.println("HP: " +merda.getHP());
       pause(1000);
       System.out.println("Stamina: " +merda.getST());
       pause(1000);
       System.out.println("Attack: " +merda.getAtk());
       pause(1000);
       System.out.println("Defence: " +merda.getDef());
       pause(1000);
       System.out.println("Speed: " +merda.getSpd());
       pause(1000);
       System.out.println("Accuracy: " +merda.getPrc() + "%");
   }
}
