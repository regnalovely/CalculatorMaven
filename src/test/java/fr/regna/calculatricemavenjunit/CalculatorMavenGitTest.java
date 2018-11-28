/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.regna.calculatricemavenjunit;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 * @author shyn2
 */
public class CalculatorMavenGitTest {
    
    private CalculatorMavenGit calculatrice;
    
    @DisplayName("Initialisation de la calculatrice")
    @BeforeEach
    public void init() {
        calculatrice = new CalculatorMavenGit();
    }
    
    public void testButtonEgaleAction(){
        //
    }
    
    public void testButtonOperationAction(){
        //
    }
    
    public void testButtonNumberAction(){
        //
    }
    
    public void testButtonPointAction(){
        //
    }
    
    public void testButtonClearAction(){
        //
    }

    /**
     * Test of main method, of class CalculatorMavenGit.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalculatorMavenGit.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
