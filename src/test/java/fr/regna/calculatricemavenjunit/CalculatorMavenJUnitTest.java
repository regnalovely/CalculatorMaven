/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.regna.calculatricemavenjunit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 * @author shyn2
 */
public class CalculatorMavenJUnitTest {
    
    private CalculatorMavenJUnit calculatrice;
    private double numberOneExpected;
    private double numberTwoExpected;
    private String operationExpected;
    private double resultatExpected;
    
    @DisplayName("Initialisation de la calculatrice")
    @BeforeEach
    public void init() {
        calculatrice = new CalculatorMavenJUnit();
    }
    
    @DisplayName("Test du nombre 1")
    @Test
    public void testSetNumberOne(){
        calculatrice.setNumber("1");
        calculatrice.setNumber("4");
        calculatrice.decimal();
        calculatrice.setNumber("2");
        calculatrice.setNumber("5");
        
        numberOneExpected = 14.25;

        assertEquals(numberOneExpected, calculatrice.numberOne.getNumber());
    }
    
    @DisplayName("Test du choix de l'opération")
    @Test
    public void testSetOperation(){
        calculatrice.setOperation("+");
        
        operationExpected = "+";
        
        assertEquals(operationExpected, calculatrice.operation);
    }
    
    @DisplayName("Test du nombre 2")
    @Test
    public void testSetNumberTwo(){
        calculatrice.setNumber("5");
        calculatrice.decimal();
        calculatrice.setNumber("7");
        calculatrice.setNumber("5");
        
        numberTwoExpected = 5.75;
        
        assertEquals(numberTwoExpected, calculatrice.numberTwo.getNumber());
    }
    
    @DisplayName("Test du calculer à effectuer")
    @Test
    public void testCalculer(){
        calculatrice.calculer();
        
        resultatExpected = numberOneExpected + numberTwoExpected;
        
        assertEquals(resultatExpected, calculatrice.resultat);
    }
}
