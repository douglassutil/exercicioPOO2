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
public class EspecialidadesTest {
    
    public EspecialidadesTest() {
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
     * Test of getNome method, of class Especialidades.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Especialidades instance = new Especialidades();
        String expResult = "Douglas";
        String result = instance.getNome();
        assertEquals(expResult, result);

    }

    /**
     * Test of setNome method, of class Especialidades.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Douglas";
        Especialidades instance = new Especialidades();
        instance.setNome(nome);

    }

    /**
     * Test of getCRM method, of class Especialidades.
     */
    @Test
    public void testGetCRM() {
        System.out.println("getCRM");
        Especialidades instance = new Especialidades();
        String expResult = "2345234";
        String result = instance.getCRM();
        assertEquals(expResult, result);

    }

    /**
     * Test of setCRM method, of class Especialidades.
     */
    @Test
    public void testSetCRM() {
        System.out.println("setCRM");
        String CRM = "2345234";
        Especialidades instance = new Especialidades();
        instance.setCRM(CRM);

    }
    
}

// Gets forçados ao erro