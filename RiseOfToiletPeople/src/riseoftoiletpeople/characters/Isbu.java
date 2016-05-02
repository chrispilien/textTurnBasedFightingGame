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
public class Isbu extends Characters{
    
    public Isbu(){
        super("Is'Bu", 50, 150, 10, 10, 175, -200, intro);
    }
    
    private static final String DIALOG_01 = "I had a tinkling thought that you Kleenirs wern't gone.";
    private static final String DIALOG_02 = "Your existance definitely pisses me off";
    private static final String DIALOG_03 = "And now, urine a wee wee bit of trouble.";
    private static final String DIALOG_04 = "Bladder you standing around for?";
    private static final String DIALOG_05 = "Did I dampen your mood?";
    private static final String DIALOG_06 = "Prepare yourself for I, IS'BU, am the fastest of we three!";
    private static final String DIALOG_07 = "And I will whizz around you, and shower you in gold!";
    private static final String DIALOG_08 = "Like the biggest bladder stones, you shall not pass!";
    
    private static String [] intro = {DIALOG_01, DIALOG_02, DIALOG_03, DIALOG_04, DIALOG_05, DIALOG_06, DIALOG_07, DIALOG_08};
    
    
   public static void main(String[] args){
       Characters isbu = new Isbu();
       preFight();
       
       System.out.println();
       pause(1000);
       System.out.println("Name: " + isbu.getName());
       pause(1000);
       System.out.println("HP: " +isbu.getHP());
       pause(1000);
       System.out.println("Stamina: " +isbu.getST());
       pause(1000);
       System.out.println("Attack: " +isbu.getAtk());
       pause(1000);
       System.out.println("Defence: " +isbu.getDef());
       pause(1000);
       System.out.println("Speed: " +isbu.getSpd());
       pause(1000);
       System.out.println("Accuracy: " +isbu.getPrc() + "%");
   }
}
