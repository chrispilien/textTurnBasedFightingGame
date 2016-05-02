/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riseoftoiletpeople;

import java.util.Scanner;
import java.util.Random;
import riseoftoiletpeople.characters.*;

/**
 *
 * @author Christopher Pilien
 */
public class RiseOfToiletPeople extends Typer{
    
    
    
    //VARIABLES
    
    static Hero hero = new Hero();
    
    static Random rng = new Random();
    
    
    private static boolean isbuDead, merdaDead, tpiDead, hDead, didDance, 
            didDistract, didSing;
    
    static int numTurns = 1;
    
    
    //h is for Hero Variables; n is for Enemy Variables
    static boolean hBlock, hDodge, hParry, hCounter, hChoke, hStun, hStnKameha,nStun;
    
    static int hCrntHP, hCrntST, hStnCount, hPriority, hStamRegen, 
            nCrntHP, nCrntST, nStnCount, nPriority, nStamRegen;
    
    
    
    
    //methods
    private static void prolougue(){
        //Expositional dialog
        System.out.println();
        
        typing("Long ago, there existed a race of super evolved humanoids.", 1);
        pause(2000);
        typing("They had powers that you can only imagine.", 1);
        pause(2000);
        typing("But they could not live on the surface world due to its atmosphere.", 1);
        pause(2500);
        typing("Among these beings, lived a genius named \"T'Pi\"", 1);
        pause(2000);
        typing("He discovered a way to use waste to survive on the surface.", 1);
        pause(2000);
        typing("His people rejected his discovery due to its disgusting nature.", 1);
        pause(2000);
        typing("Only two of his kinsmen accepted his research.", 1);
        pause(2000);
        typing("Due to his research their power rose exponentially.", 1);
        pause(2000);
        typing("And the three annihilated anyone who opposed them.", 1);
        pause(2000);
        typing("Eventually, only they remained the sole members of their species.", 1);
        pause(2200);
        typing("When they went to the surface world to conquer it,", 1);
        pause(1800);
        typing("They were stopped by a magical clan called the \"Kleenirs.\"", 1);
        pause(2000);
        typing("So they went into hiding underground,", 1);
        pause(1800);
        typing("to collect the waste of humanity and power themselves up", 1);
        pause(2000);
        typing("and wait for an opportunity to rise once more.", 1);
        System.out.println();
        System.out.println();
        pause(3000);
        typing("3,000 years have passed, and with the Kleenirs nearly gone,", 66);
        typing("the three rose from the sewers, to conquer the world once again.", 66);
        System.out.println();
        System.out.println();
        pause(3000);
        typing("You are the last of the Kleenirs and the last hope for humanity...", 66);
        pause(2000);
        System.out.println();
        System.out.println();
        System.out.println("==================================================");
        System.out.println();
    }

    
/*
    -------------------------------------------------------------------------------
*/   
    
    private static void createHero(){
        Scanner input = new Scanner(System.in);
        
        String strInput;
        
        int statPool = 500;
        
        boolean nameLoop;
        boolean atkLoop = true;
        boolean defLoop = true;
        boolean spdLoop = true;
        boolean prcLoop = true;
        boolean hpLoop = true;
        
        
        
        
        do{
                System.out.println();
                System.out.print("What is your name: ");
                strInput = input.nextLine();
                if(strInput.equals("")){
                    System.out.println("Enter a name please!");
                        nameLoop = true;
                }else{
                        nameLoop = false;
                        hero.setName(strInput);
                        System.out.println("Name: " + hero.getName());
                }
        }while (nameLoop == true);
        
        System.out.println();
        System.out.println("INSTRUCTIONS:");
        System.out.println("-------------");
        System.out.println("You need to train your stats.");
        System.out.println("You have 500 points to spend.");
        System.out.println("ATK will increase your damage.");
        System.out.println("DEF will decrease the damage taken.");
        System.out.println("SPD will increase your dodge chance and chance to go first.");
        System.out.println("PRC is your perception, it measures how accurate you are.");
        System.out.println("HP is your life force, with out it you die.");
        System.out.println("ST is your energy, the price you pay for each action.");
        
        do{
            System.out.println("");
            System.out.print("Add to your ATK stat: (" + statPool + " stat points left.) ");
            if(!input.hasNextInt()){
                    System.out.println("");
                    input.next();
            }else{
                int addStat = Math.abs(input.nextInt());
                if(addStat > statPool){
                    System.out.println("Don't push your luck buddy! Use the stat points given to you.");
                }else{
                    statPool -= addStat;
                    hero.setAtk(addStat);
                    System.out.println("ATK: " + hero.getAtk());
                    atkLoop = false;
                }
            }
        }while(atkLoop == true);
        
        
        do{
            System.out.println("");
            System.out.print("Add to your Def stat: (" + statPool + " stat points left.) ");
            if(!input.hasNextInt()){
                    System.out.println("");
                    input.next();
            }else{
                int addStat = Math.abs(input.nextInt());
                if(addStat > statPool){
                    System.out.println("Don't push your luck buddy! Use the stat points given to you.");
                }else{
                    statPool -= addStat;
                    hero.setDef(addStat);
                    System.out.println("DEF: " + hero.getDef());
                    defLoop = false;
                }
            }
        }while(defLoop == true);
        
        
        do{
            System.out.println("");
            System.out.print("Add to your SPD stat: (" + statPool + " stat points left.) ");
            if(!input.hasNextInt()){
                    System.out.println("");
                    input.next();
            }else{
                int addStat = Math.abs(input.nextInt());
                if(addStat > statPool){
                    System.out.println("Don't push your luck buddy! Use the stat points given to you.");
                }else{
                    statPool -= addStat;
                    hero.setSpd(addStat);
                    System.out.println("SPD: " + hero.getSpd());
                    spdLoop = false;
                }
            }
        }while(spdLoop == true);
        
        
        do{
            System.out.println("");
            System.out.print("Add to your PRC stat: (" + statPool + " stat points left.) ");
            if(!input.hasNextInt()){
                    System.out.println("");
                    input.next();
            }else{
                int addStat = Math.abs(input.nextInt());
                if(addStat > statPool){
                    System.out.println("Don't push your luck buddy! Use the stat points given to you.");
                }else{
                    statPool -= addStat;
                    hero.setPrc(addStat);
                    System.out.println("PRC: " + hero.getPrc());
                    prcLoop = false;
                }
            }
        }while(prcLoop == true);
        
        
        do{
            System.out.println("");
            System.out.print("Add to your HP stat: (" + statPool + " stat points left.) ");
            if(!input.hasNextInt()){
                    System.out.println();
                    input.next();
            }else{
                int addStat = Math.abs(input.nextInt());
                if(addStat > statPool){
                    System.out.println("Don't push your luck buddy! Use the stat points given to you.");
                }else{
                    statPool -= addStat;
                    hero.setHP(addStat);
                    hCrntHP = hero.getHP();
                    System.out.println("HP: " + hero.getHP());
                    hpLoop = false;
                }
            }
        }while(hpLoop == true);
        
        hero.setST(statPool);
        hCrntST = hero.getST();
        
        System.out.println("The rest of your stat points is placed into your ST");
        System.out.println("ST: " + hero.getST());
        System.out.println();
        
        System.out.println("==================================================");
        System.out.println();
    }
    
/*
    -------------------------------------------------------------------------------
    ---------------------------------BATTLE-COMMANDS-------------------------------
    -------------------------------------------------------------------------------
*/    
    
    private static int damageCalculation(int damage, int df){
    // Calculates the damage based on the base damage calculations on the other fight methods and the defense
        int ranReduce = rng.nextInt(df / 2) + df;
        
        int defense = ranReduce + 250;
        
        double damRed= 250.0 / defense ; //needs a '.0' or else will return 0.0
        
        double finalDamage = damRed * damage;
        int iFinDam = (int)finalDamage;
        return iFinDam;
    }
    
    private static void basicStrike(String action, boolean dBlock, boolean dDodge, boolean dParry){
        
        
    }
    private static void closeStrike(String action, boolean dBlock, boolean dDodge, boolean dParry){
        
        
    }
    private static void kick(String action, boolean dBlock, boolean dDodge, boolean dParry){
        
        
    }
    private static void blitz(){
        
    }
    
    
    private static void kamehameha(Characters n){
    //secret skill
        if(hStun == false){
            System.out.println(hStnCount + " 1");
            hStnCount = 4;
            hStun = !hStun;
            hStnKameha = true;
                System.out.println(hero.getName() + " is charging an attack!");
                System.out.println();
                
            System.out.println(hStnCount + " 2");
                System.out.println("Kaaa...");
                System.out.println();
        }else{
                switch(hStnCount){
                    case 4: 
                        System.out.println("May..");
                        System.out.println();
                        break;
                    case 3: 
                        System.out.println("Haaa....");
                        System.out.println();
                        break;
                    case 2: 
                        System.out.println("MAY!");
                        System.out.println();
                        break;
                    case 1: 
                        System.out.println("HAAAAAAAAA!");
                        System.out.println();
                        
                        int halfST = hCrntST / 2;
                        
                        hCrntST -= halfST;
                        
                        int baseDamage = halfST * 8 + hero.getAtk();
                        
                        int iFinalDam = damageCalculation(baseDamage, n.getDef());
                        
                        nCrntHP -= iFinalDam;
                        
                        System.out.println(n.getName() + " took " + iFinalDam + " points of damage from the Kamehameha!");
                        System.out.println(nCrntHP);
                        System.out.println();
                        
                         hStnKameha = false;
                        break;
                        
                    default: 
                        break;
                }
            
                hStnCount--;
        }
    }
    
    private static void doNothing(Hero h){
        int roll = rng.nextInt(100)+1;
        if (roll < 5){
            System.out.println("MAGIK- I mean, " + h.getName() + " used SPLASH. But nothing happened!");
        }else{
            System.out.println(h.getName() + " did nothing.");
        }
        System.out.println();
    }
/*
    -------------------------------------------------------------------------------
*/
    
    
    
    
    public static void fight(Hero h, Characters n){
        //System.out.println(n.getName().toUpperCase() + ":");
        //Characters.preFight();
        
        Scanner input = new Scanner(System.in);
        
        
        nCrntHP = n.getHP();
        //*/
        do{
            String hAction;
            System.out.println("Turn: " + numTurns);
                System.out.println();
            System.out.println(n.getName() + " HP: " + nCrntHP);
                System.out.println();
            System.out.println(h.getName() + " HP: " + hCrntHP);
                System.out.println();
            System.out.println(h.getName() + " ST: " + hCrntST + "/" + h.getST());
                System.out.println();
            
            if(hStun == true){
            System.out.println(hStnCount + " 0");
                
                    if(hStnCount <= 0){
                        
                        hStun = false;
                        
                    }
                    if(hStnKameha){
                        kamehameha(n);
                    }
            }else if (hStun == false){
                
                do{
                    System.out.println("Enter an action (Enter \"Actions\" for a list of actions): ");
                    hAction = input.nextLine();
                    if(hAction.equalsIgnoreCase("actions")){
                        System.out.println("List of Actions:");
                        System.out.println("\tPunch, Kick, Slap, Elbow, Knee, Blitz/Combo");
                        System.out.println("\tBlock, Parry, Dodge, Counter");
                        System.out.println("\tHeal, Taunt, Nothing");
                    }else{
                        switch(hAction.toUpperCase()){
                            case "KAMEHAMEHA":
                                kamehameha(n);
                                break;
                            case "BLOCK":
                                hBlock = true;
                                break;
                            default:
                                doNothing(h);
                                break;
                        }
                    }
                }while(hAction.equalsIgnoreCase("actions"));
            }
            
            
            
            
            if(nStun){
                nStnCount--;
                if(nStnCount <= 0)
                    nStun = false;
            }else{
                
            }
            //*/
            //priority
            
            //stamina regen
            numTurns++;
            
            System.out.println("==================================================");
            System.out.println();
        }while((hCrntHP > 0) && (nCrntHP > 0));
        
    }
    
    
    
/*
    -------------------------------------------------------------------------------
*/
    public static void main(String[] args) {
        
        //main method variables
        
        /*
        prolougue();
        
        load();
        
        // This is a smart way to comment things in and out */
        
        createHero();
        
        do{
        Characters isbu = new Isbu();
        isbuDead = false;
        fight(hero, isbu);
        
        
        /*
        if(hDead){
            System.out.println("You died.");
            System.out.println("HINT: IS'BU may be fast, but he is weak & inaccurate.");
        }else{
            
            Characters merda = new Merda();
            fight(hero, merda);

            if(hDead){
                System.out.println("You died.");
                System.out.println("HINT: MER'DA may be strong, but he is slow & squishy.");
            }else{

                Characters tpi = new Tpi();

                fight(hero, tpi);
                
                if(hDead){
                    System.out.println("You died.");
                    System.out.println("HINT: No hints, T'PI is just final-boss strong.");
                }
            }
        }
        
        if(!hDead){
            System.out.println("You win.");
            break;
        }
        //*/
        }while(false);
        
    }
    
}
