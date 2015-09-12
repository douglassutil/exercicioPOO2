/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Douglas
 */
public class PlanoSaudeTest {
    
    public PlanoSaudeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getRazaoSocial method, of class PlanoSaude.
     */
    @Test
    public void testGetRazaoSocial() {
        System.out.println("getRazaoSocial");
        PlanoSaude instance = new PlanoSaude();
        String expResult = "titioavô";
        String result = instance.getRazaoSocial();
        assertEquals(expResult, result);

    }

    /**
     * Test of setRazaoSocial method, of class PlanoSaude.
     */
    @Test
    public void testSetRazaoSocial() {
        System.out.println("setRazaoSocial");
        String razaoSocial = "titioavô";
        PlanoSaude instance = new PlanoSaude();
        instance.setRazaoSocial(razaoSocial);

    }

    /**
     * Test of getCNPJ method, of class PlanoSaude.
     */
    @Test
    public void testGetCNPJ() {
        System.out.println("getCNPJ");
        PlanoSaude instance = new PlanoSaude();
        String expResult = "83725752300";
        String result = instance.getCNPJ();
        assertEquals(expResult, result);

    }

    /**
     * Test of setCNPJ method, of class PlanoSaude.
     */
    @Test
    public void testSetCNPJ() {
        System.out.println("setCNPJ");
        String CNPJ = "83725752300";
        PlanoSaude instance = new PlanoSaude();
        instance.setCNPJ(CNPJ);

    }

    /**
     * Test of getEndereco method, of class PlanoSaude.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        PlanoSaude instance = new PlanoSaude();
        String expResult = "Palma de Santa Rita";
        String result = instance.getEndereco();
        assertEquals(expResult, result);

    }

    /**
     * Test of setEndereco method, of class PlanoSaude.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        String endereco = "Palma de Santa Rita";
        PlanoSaude instance = new PlanoSaude();
        instance.setEndereco(endereco);
       
    }

    /**
     * Test of getTelefone method, of class PlanoSaude.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        PlanoSaude instance = new PlanoSaude();
        String expResult = "992483959";
        String result = instance.getTelefone();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTelefone method, of class PlanoSaude.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        String telefone = "992483959";
        PlanoSaude instance = new PlanoSaude();
        instance.setTelefone(telefone);

    }
    
}
// Gets forçados ao erro