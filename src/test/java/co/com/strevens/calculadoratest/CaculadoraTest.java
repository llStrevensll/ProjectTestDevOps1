/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.strevens.calculadoratest;

import co.com.strevens.calculadora.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author angue
 */
public class CaculadoraTest {
    
    public CaculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testSuma() {
        int resultado = Calculadora.suma(2, 3);
        int esperado = 5; // 2 + 3 = 5
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testResta() {
        int resultado = Calculadora.resta(3, 2);
        int esperado = 1; // 3 - 2 = 1
        assertEquals(esperado, resultado);
    }
}
