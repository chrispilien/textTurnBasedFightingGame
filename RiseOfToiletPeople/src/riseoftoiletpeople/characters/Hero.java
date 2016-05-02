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
public class Hero{
    private static String hName = "Tirsus";
    private static int maxHP;        //Max HP
    private static int maxST;        //max stamina
    private static int atk;          //attack stat
    private static int def;          //defence stat
    private static int spd;          //speed stat
    private static int prc;        //perception stat
    
    
    
    
    
    public void setName(String s){
        hName = s;
    }
    public void setHP(int i){
        maxHP = 250+ (i*10);
    }
    public void setST(int i){
        maxST = 100 + (i*10);
    }
    public void setAtk(int i){
        atk = 25+i;
    }
    public void setDef(int i){
        def = 25+i;
    }
    public void setSpd(int i){
        spd = 25+i;
    }
    public void setPrc(int i){
        prc = i * 50 /500  + 50;
    }
    
    
    public String getName(){
        return hName;
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
}
