/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.regna.calculatricemavenjunit;

import fr.regna.calculatricemavenjunit.entity.Number;

/**
 *
 * @author etudiant
 */
public class Test {
     public static void main(String args[]) {
        System.out.println("--- --- ---Création de l'objet");
        
        Number number = new Number(14);
        testingNumber(number);
        
        Number numberTwo = new Number(25, "08");
        testingNumber(numberTwo);
    }
     public static void testingNumber(Number number){
        afficherNombre(number);
        estDecimal(number);
        //changeDecimal(number, "75");
        estDecimal(number);
        explodeNumber(number);
     }
     
     public static void afficherNombre(Number number){
        System.out.println("Le nombre est : " + number.getNumber());
     }
     
     public static void estDecimal(Number number){
        System.out.println("Le nombre est il un décimal ? " + number.isDecimal());
     }
     
     public static void changeDecimal(Number number, String decimal){
        System.out.println("--- --- ---Mis à jour du nombre entier à décimal");
        number.setDecimal(decimal);
        System.out.println("Le nombre est maintenant : " + number.getNumber());
     }
     
     public static void explodeNumber(Number number){
        afficherNombre(number);
        System.out.println("La partie entière : " + number.getValue());
        System.out.println("La partie décimale : " + number.getDecimal());
     }
     
     public static void changeNumber(Number number, double numberDecimal){
        System.out.println("--- --- ---Modification du nombre");
        number.setNumber(numberDecimal);
        explodeNumber(number);
     }
}