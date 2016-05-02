/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riseoftoiletpeople.characters;

import riseoftoiletpeople.Typer;
/**
 *
 * @author Christopher Pilien
 */
public class Characters extends Typer{
    private  String name;      //name of the character
    
    //stats
    private int maxHP;        //Max HP
    private int maxST;        //max stamina
    private int atk;          //attack stat
    private int def;          //defence stat
    private int spd;          //speed stat
    private int prc;        //perception stat
    
    private static String [] intro;
    
    protected Characters(String s, int i1, int i2, int i3, int i4, int i5, int i6, String[] l){
        setName(s);
        setHP(i1);
        setST(i2);
        setAtk(i3);
        setDef(i4);
        setSpd(i5);
        setPrc(i6);
        intro = l;
    }
    
    
    //set
    private void setName(String s){
        name = s;
    }
    private void setHP(int i){
        maxHP = 250+ (i*10);
    }
    private void setST(int i){
        maxST = 100 + (i*10);
    }
    private void setAtk(int i){
        atk = 25+i;
    }
    private void setDef(int i){
        def = 25+i;
    }
    private void setSpd(int i){
        spd = 25+i;
    }
    private void setPrc(int i){
        prc = i * 50 /500  + 50;
    }
    
    
    
    
    //get
    
    public String getName(){
        return name;
    }
    public int getHP(){
        return maxHP;
    }
    public int getST(){
        return maxST;
    }
    public int getAtk(){
        return atk;
    }
    public int getDef(){
        return def;
    }
    public int getSpd(){
        return spd;
    }
    public int getPrc(){
        return prc;
    }
    
    public static void preFight(){
        for(String s: intro){
            System.out.println();
            System.out.println(s);
            pause(2000);
        }
    }
}
