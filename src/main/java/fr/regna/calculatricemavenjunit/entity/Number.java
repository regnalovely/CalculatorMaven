/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.regna.calculatricemavenjunit.entity;

/**
 *
 * @author shyn2
 */
public class Number {
    
    int entier;
    String decimal = "0";

    public Number(int entier) {
        this.entier = entier;
    }
    
    public Number(int entier, String decimal){
        this.entier = entier;
        this.decimal = decimal;
    }
    
    public void setValue(int entier) {
        this.entier = entier;
    }

    public void setDecimal(String decimal) {
        this.decimal = decimal;
    }
    
    public void setNumber(double number) {
        String numberString = String.valueOf(number);
        
        int index = numberString.indexOf(".");
        int lng = numberString.length();
        
        int numberEntier = Integer.parseInt(numberString.substring(0, index));
        String numberDecimal = numberString.substring(index+1, lng);
        
        this.entier = numberEntier;
        this.decimal = numberDecimal;
        
    }
    
    public int getValue() {
        return entier;
    }
    
    public String getDecimal() {
        return decimal;
    }
    
    public boolean isDecimal() {
        return !"0".equals(decimal);
    }
    
    public double getNumber() {
        String numberString = entier + "." + decimal;
        double number = Double.parseDouble(numberString);
        return number;
    }
}
